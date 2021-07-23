import React, { useEffect, useState } from "react";
import Select from 'react-select'
import { ApiPathBase, optionsMoneda, optionsMes } from '../../configuration.json'
import { ObtenerAnio } from '../../util'
import {
    LineChart,
    Line,
    XAxis,
    YAxis,
    CartesianGrid,
    Tooltip,
    Legend
} from "recharts";

const optionsAnio = ObtenerAnio()

export default function App() {
    const [anio, setAnio] = useState(optionsAnio[0]['value'])
    const [mes, setMes] = useState(optionsMes[0]['value'])
    const [moneda, setMoneda] = useState(optionsMoneda[0]['value'])
    
    function onChangeAnio(e) {
        setAnio(e.value)
        obtenerVentasTotales(e.value, mes, moneda)
    }
    
    function onChangeMes(e) {
        setMes(e.value)
        obtenerVentasTotales(anio, e.value, moneda)
    }
    
    function onChangeMoneda(e) {
        setMoneda(e.value)
        obtenerVentasTotales(anio, mes, e.value)
    }

    const [ventas, setVentas] = useState()
    const obtenerVentasTotales = async (anio, mes, moneda) => {
        const data = await fetch(`${ApiPathBase}/Ventas/Diarias/${anio},${mes},${moneda}`)        
        const dataJSON = await data.json()
        var arrVentas = []
        if (dataJSON.length > 0) {
            arrVentas = dataJSON.map((item) => {
                return { name: item.id , monto: item.total }
            })
        }
        setVentas(arrVentas)  
    }

    useEffect(() => {
        obtenerVentasTotales(anio, mes, moneda)
    }, [])

    return (
        <div className="main-card card" id="DailySalesReport">
            <h1>Ventas Diarias</h1>
            <div className="filter">
                <Select className="filter-item" options={optionsAnio} defaultValue={optionsAnio[0]} onChange={onChangeAnio} />
                <Select className="filter-item" options={optionsMes} defaultValue={optionsMes[0]} onChange={onChangeMes} />
                <Select className="filter-item" options={optionsMoneda} defaultValue={optionsMoneda[0]} onChange={onChangeMoneda} />
            </div>

            <LineChart
                width={1200}
                height={400}
                data={ventas}
                margin={{
                    top: 5,
                    right: 30,
                    left: 20,
                    bottom: 5
                }}
            >
                <CartesianGrid strokeDasharray="3 3" />
                <XAxis dataKey="name" />
                <YAxis />
                <Tooltip />
                <Legend />
                <Line type="monotone" dataKey="monto" stroke="#FC4B3F" />
            </LineChart>
        </div>
    );
}
