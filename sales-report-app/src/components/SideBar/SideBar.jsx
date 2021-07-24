import React from "react";
import "./SideBar.css";
import usuario from "./usuario_master.png";
const user = "Juan Carlos"

export default function Main() {
  return (
    <div className="sidebar">
      <div className="perfil">
        <img src={usuario} className="img-card" />
      </div>
      <div className="name-user">
          {user}
      </div>
      <ul className="sidebar-list">
        <li className="row">
          <div id="title">
            <a href="#MonthlySalesReport">Ventas Mensuales</a>
          </div>
        </li>
        <li className="row">
          <div id="title">
            <a href="#DailySalesReport">Ventas Diarias</a>
          </div>
        </li>
        <li className="row">
          <div id="title">
            <a href="#ProductsSalesReport">Top Productos</a>
          </div>
        </li>
        <li className="row">
          <div id="title">
            <a href="#CustomerSalesReport">Top Clientes</a>
          </div>
        </li>
      </ul>
    </div>
  );
}
