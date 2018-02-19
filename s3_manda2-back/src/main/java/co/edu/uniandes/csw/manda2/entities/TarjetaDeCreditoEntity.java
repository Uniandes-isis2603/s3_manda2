/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.manda2.entities;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author na.caceres
 */
@Entity
public class TarjetaDeCreditoEntity extends MedioDePagoEntity implements Serializable {
    
    //Atributos
    /**
     * Atributo que representa el numero de una tarjeta de credito.
     */
    private Integer numeroTarjeta;
    //Metodos

    /**
     * @return the numeroTarjeta
     */
    public Integer getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * @param numeroTarjeta the numeroTarjeta to set
     */
    public void setNumeroTarjeta(Integer numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
}
