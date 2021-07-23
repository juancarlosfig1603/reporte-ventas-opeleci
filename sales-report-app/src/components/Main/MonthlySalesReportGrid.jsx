import React, { useEffect, useState } from 'react'
import { ApiPathBase,optionsMoneda } from '../../configuration.json'
import { ObtenerAnio } from '../../util'
import Select from 'react-select'

const optionsAnio = ObtenerAnio()


const data = [{"enero":78686,"febrero":5345}]

function TableComponent() {
  const [anio, setAnio] = useState(optionsAnio[0]['value'])
  const [moneda, setMoneda] = useState(optionsMoneda[0]['value'])
  function onChangeAnio(e) {
    setAnio(e.value)  
    obtenerVentasTotales(e.value,moneda)
  }
  function onChangeMoneda(e) {  
    setMoneda(e.value)  
    obtenerVentasTotales(anio,e.value)
  }
  const [ventas, setVentas] = useState()
  const obtenerVentasTotales = async (anio,moneda) => {
    const data = await fetch(`${ApiPathBase}/Ventas/Totales/${anio},${moneda}`)
    const dataJSON = await data.json()
    var arrVentas = []
    if (dataJSON.length > 0) {
      arrVentas = dataJSON.map((item)=>{
        return { name: item.mes, value: item.total }
      })
    }
    setVentas(arrVentas)
  }

  useEffect(() => {
    obtenerVentasTotales(anio,moneda)
  }, [])

  return (
    <div className="main-card card" id="MonthlySalesReport">
      <h1>Ventas Anuales</h1>
      <div className="filter">
      <Select className="filter-item" options={optionsAnio}  defaultValue={optionsAnio[0]} onChange={onChangeAnio}/>
      <Select className="filter-item" options={optionsMoneda} defaultValue={optionsMoneda[0]} onChange={onChangeMoneda}/>
      </div>
        <table>
            <thead><th>Enero</th><th>Febrero</th></thead>
            <tbody>
                data.map((item)=>{
                    return `<tr><rd>${item.}</rd></tr>`
                })
            </tbody>
        </table>
    </div>
  )
}

export default function MonthlySalesReportGrid() {
  return (
      <TableComponent />
  )
}
