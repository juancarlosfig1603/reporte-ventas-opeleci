
package com.opeleci.reportes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ventas {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer ID;
    private Double ENE;
    private Double FEB;
    private Double MAR;
    private Double ABR;
    private Double MAY;
    private Double JUN;
    private Double JUL;
    private Double AGO;
    private Double SEP;
    private Double OCT;
    private Double NOV;
    private Double DIC;

    
    public Ventas(){
        
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }
    
    public Double getENE() {
        return ENE;
    }

    public void setENE(Double ENE) {
        this.ENE = ENE;
    }

    public Double getFEB() {
        return FEB;
    }

    public void setFEB(Double FEB) {
        this.FEB = FEB;
    }

    public Double getMAR() {
        return MAR;
    }

    public void setMAR(Double MAR) {
        this.MAR = MAR;
    }

    public Double getABR() {
        return ABR;
    }

    public void setABR(Double ABR) {
        this.ABR = ABR;
    }

    public Double getMAY() {
        return MAY;
    }

    public void setMAY(Double MAY) {
        this.MAY = MAY;
    }

    public Double getJUN() {
        return JUN;
    }

    public void setJUN(Double JUN) {
        this.JUN = JUN;
    }

    public Double getJUL() {
        return JUL;
    }

    public void setJUL(Double JUL) {
        this.JUL = JUL;
    }

    public Double getAGO() {
        return AGO;
    }

    public void setAGO(Double AGO) {
        this.AGO = AGO;
    }

    public Double getSEP() {
        return SEP;
    }

    public void setSEP(Double SEP) {
        this.SEP = SEP;
    }

    public Double getOCT() {
        return OCT;
    }

    public void setOCT(Double OCT) {
        this.OCT = OCT;
    }

    public Double getNOV() {
        return NOV;
    }

    public void setNOV(Double NOV) {
        this.NOV = NOV;
    }

    public Double getDIC() {
        return DIC;
    }

    public void setDIC(Double DIC) {
        this.DIC = DIC;
    }
     
    public Ventas (Integer ID, Double ENE, Double FEB, Double MAR, Double ABR, Double MAY, Double JUN, Double JUL, Double AGO, Double SEP, Double OCT, Double NOV, Double DIC){
        
        this.ID = ID;
        this.ENE = ENE;
        this.FEB = FEB;
        this.MAR = MAR;
        this.ABR = ABR;
        this.MAY = MAY;
        this.JUN = JUN;
        this.JUL = JUL;
        this.AGO = AGO;
        this.SEP = SEP;
        this.OCT = OCT;
        this.NOV = NOV;
        this.DIC = DIC;
    }
}
