import React, { useEffect, useState } from 'react';
import { PieChart, Pie, Cell } from 'recharts';
import Select from 'react-select'
import { ApiPathBase, optionsMes, optionsMoneda, Colors } from '../../configuration.json'
import { ObtenerAnio } from '../../util'

const optionsAnio = ObtenerAnio()
const COLORS = Colors;

export default function CustomerSalesReport() {
    const [anio, setAnio] = useState(optionsAnio[0]['value'])
    const [mes, setMes] = useState(optionsMes[0]['value'])
    const [moneda, setMoneda] = useState(optionsMoneda[0]['value'])
    const [ventas, setVentas] = useState([])

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

    const obtenerVentasTotales = async (anio, mes, moneda) => {
        const data = await fetch(`${ApiPathBase}/Ventas/Clientes/Totales/${anio},${mes},${moneda}`)
        const dataJSON = await data.json()

        console.log(dataJSON);

        var arrVentas = []
        if (dataJSON.length > 0) {
            arrVentas = dataJSON.map((item) => {
                return { cliente: item.cliente, monto: item.total }
            })
        }
        setVentas(arrVentas)
    }

    useEffect(() => {
        obtenerVentasTotales(anio, mes, moneda)
    }, [])

    const RADIAN = Math.PI / 180;
    const renderCustomizedLabel = ({
        cx,
        cy,
        midAngle,
        innerRadius,
        outerRadius,
        percent,
        index
    }) => {
        const radius = innerRadius + (outerRadius - innerRadius) * 0.7;
        const x = cx + radius * Math.cos(-midAngle * RADIAN);
        const y = cy + radius * Math.sin(-midAngle * RADIAN);
        return (
            <text
                x={x}
                y={y}
                fill="black"
                fontSize="16"
                fontWeight="bold"                
                textAnchor={x > cx ? "start" : "end"}
                dominantBaseline="central"

            >
                {`${ventas[index].cliente} ${(percent * 100).toFixed(0)}%`}
            </text>
        );
    };


    return (
        <div className="main-card card" id="CustomerSalesReport">
            <h1>Mejores Clientes</h1>
            <div className="filter">
                <Select className="filter-item" options={optionsAnio} defaultValue={optionsAnio[0]} onChange={onChangeAnio} />
                <Select className="filter-item" options={optionsMes} defaultValue={optionsMes[0]} onChange={onChangeMes} />
                <Select className="filter-item" options={optionsMoneda} defaultValue={optionsMoneda[0]} onChange={onChangeMoneda} />
            </div>


            <PieChart width={1200} height={620}>
                <Pie
                    data={ventas}
                    cx={600}
                    cy={300}
                    labelLine={false}
                    label={renderCustomizedLabel}
                    outerRadius={300}
                    fill="#8884d8"
                    dataKey="monto"
                >
                    {ventas.map((entry, index) => (
                        <Cell key={`cell-${index}`} fill={COLORS[index % COLORS.length]} />
                    ))}
                </Pie>
            </PieChart>


        </div>
    );
}


