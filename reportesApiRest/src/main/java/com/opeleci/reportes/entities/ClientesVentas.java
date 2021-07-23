

package com.opeleci.reportes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClientesVentas {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer ID;
    private Integer ANIO;
    private String MES;
    private String CLIENTE;
    private Double TOTAL;
    
    
    public ClientesVentas(){        
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getANIO() {
        return ANIO;
    }

    public void setANIO(Integer ANIO) {
        this.ANIO = ANIO;
    }

    public String getMES() {
        return MES;
    }

    public void setMES(String MES) {
        this.MES = MES;
    }

    public String getCLIENTE() {
        return CLIENTE;
    }

    public void setCLIENTE(String CLIENTE) {
        this.CLIENTE = CLIENTE;
    }

    public Double getTOTAL() {
        return TOTAL;
    }

    public void setTOTAL(Double TOTAL) {
        this.TOTAL = TOTAL;
    }
    
    public ClientesVentas(Integer Id, Integer Anio, String Mes, String Cliente, Double Total){
        
        this.ID = Id;
        this.ANIO = Anio;
        this.MES = Mes;
        this.CLIENTE = Cliente;
        this.TOTAL = Total;
    }
}
