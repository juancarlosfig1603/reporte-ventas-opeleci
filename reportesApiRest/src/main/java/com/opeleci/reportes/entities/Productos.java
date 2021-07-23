
package com.opeleci.reportes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Productos {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String CODIGO;
    private String PRODUCTO;
    private Integer NUMERO_VENTAS;
    
    public  Productos(){
    }

    public Integer getId() {
        return ID;
    }

    public void setId(Integer Id) {
        this.ID = Id;
    }

    public String getProducto() {
        return PRODUCTO;
    }

    public void setProducto(String Producto) {
        this.PRODUCTO = Producto;
    }

    public Integer getCantidad() {
        return NUMERO_VENTAS;
    }

    public void setCantidad(Integer Cantidad) {
        this.NUMERO_VENTAS = Cantidad;
    }
    
    public String getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(String CODIGO) {
        this.CODIGO = CODIGO;
    }

    public Productos(Integer Id, String Codigo, String Producto, Integer Numero_Ventas) {
        this.ID = Id;
        this.CODIGO = Codigo;
        this.PRODUCTO = Producto;
        this.NUMERO_VENTAS = Numero_Ventas;
    }

    
}
