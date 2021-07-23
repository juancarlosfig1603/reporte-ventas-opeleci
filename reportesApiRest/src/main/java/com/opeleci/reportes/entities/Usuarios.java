
package com.opeleci.reportes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Usuarios {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer ID;
    private Integer OPC;
    private String Codigo;
    private String NombresCompletos;
    private String Empresa;
    private String RUC;
    private String DNI;
    private String Email;
    private String Estado;
    private String Tipo;
    
    public Usuarios(){
        
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getOPC() {
        return OPC;
    }

    public void setOPC(Integer OPC) {
        this.OPC = OPC;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombresCompletos() {
        return NombresCompletos;
    }

    public void setNombresCompletos(String NombresCompletos) {
        this.NombresCompletos = NombresCompletos;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    public Usuarios (Integer ID, Integer OPC, String Codigo, String NombresCompletos, String Empresa, String RUC, String DNI, String Email, String Estado, String Tipo){
        
        this.Codigo = Codigo;
        this.DNI = DNI;
        this.Email = Email;
        this.Empresa = Empresa;
        this.Estado = Estado;
        this.NombresCompletos = NombresCompletos;
        this.ID = ID;
        this.OPC = OPC;
        this.RUC = RUC;
        this.Tipo = Tipo;
        
    }
}
