import React from 'react'
import './SideBar.css'

export default function Main() {
    return (
        <div className="sidebar">
            <ul className="sidebar-list">
                <li className="row"><div id="title"><a href="#MonthlySalesReport">Ventas Mensuales</a></div></li>
                <li className="row"><div id="title"><a href="#ProductsSalesReport">Top Productos</a></div></li>
                <li className="row"><div id="title"><a href="#CustomerSalesReport">Top Clientes</a></div></li>
                <li className="row"><div id="title"><a href="#DailySalesReport">Ventas Diarias</a></div></li>
            </ul>
        </div>
    )
}