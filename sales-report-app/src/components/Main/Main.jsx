import React from 'react'
import SideBar from "../SideBar/SideBar";
import MonthlySalesReport from "./MonthlySalesReport";
import ProductsSalesReport from "./ProductsSalesReport";
import CustomerSalesReport from "./CustomerSalesReport";
import DailySalesReport from "./DailySalesReport"
export default function Main() {
    return (
        <div className="master">
            <SideBar/>
            <div className="main">
                <MonthlySalesReport />
                <br/><br/><br/><br/>
                <DailySalesReport />
                <br/><br/><br/><br/>
                <ProductsSalesReport />
                <br/><br/><br/><br/>
                <CustomerSalesReport />
                <br/><br/><br/><br/>                
            </div>
        </div>

    )
}