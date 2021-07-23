package com.opeleci.reportes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Clientes {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String CLIENTE;
    private Double TOTAL;

    public Clientes(){        
    }
    
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
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

    public Clientes(Integer Id, String Cliente, Double Total) {
        this.ID = Id;
        this.CLIENTE = Cliente;
        this.TOTAL = Total;
    }
}
