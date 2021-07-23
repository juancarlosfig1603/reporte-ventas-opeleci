import React,{useState,useEffect} from "react";
import { ApiPathBase,optionsMoneda,Colors } from '../../configuration.json'
import { ObtenerAnio } from '../../util'
import Select from 'react-select'

import {
  ComposedChart,
  Line,
  Bar,
  XAxis,
  YAxis,
  CartesianGrid,
  Tooltip,
  Legend,
  Area
} from "recharts";

const optionsAnio = ObtenerAnio()

export default function ProductsSalesReport() {
  const [anio, setAnio] = useState(optionsAnio[0]['value'])

  function onChangeAnio(e) {
    setAnio(e.value)  
    obtenerVentasTotales(e.value)
  }
  
  const [ventas, setVentas] = useState([])
  const obtenerVentasTotales = async (anio) => {
    const data = await fetch(`${ApiPathBase}/Ventas/Productos/Top/${anio}`)
    const dataJSON = await data.json()

    console.log(dataJSON);

    var arrVentas = []
    if (dataJSON.length > 0) {
      arrVentas = dataJSON.map((item)=>{
        return { name: item.producto, ventas: item.cantidad, codigo: item.codigo }
      })
    }
    setVentas(arrVentas)
  }

  useEffect(() => {
    obtenerVentasTotales(anio)
  }, [])

  
  return (
    <div className="main-card card" id = "ProductsSalesReport">
      <h1>Productos mas Vendidos</h1>
      <div className="filter">
        <Select className="filter-item" options={optionsAnio} defaultValue={optionsAnio[0]} onChange={onChangeAnio} />
      </div>
      
      <ComposedChart
      layout="vertical"
      width={1200}
      height={400}
      data={ventas}
      margin={{
        top: 20,
        right: 20,
        bottom: 20,
        left: 60
      }}
    >
      <CartesianGrid stroke="#f5f5f5" />
      <XAxis type="number" />
      <YAxis dataKey="codigo" type="category" scale="band" />
      <Tooltip />
      <Legend />
      
      <Bar dataKey="ventas" barSize={20} fill="#f9c74f" />
      
    </ComposedChart>

    </div>
  );
}
