/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.manda2.dtos;

import java.util.Date;

/**
 *
 * @author m.moreno
 */
public class PagoDTO {
    
    /**
     * Constante que indica si el pago ha sido finalizado.
     */
    public static String FINALIZADO = "FINALIZADO";
    /**
     * Constante que indica si el pago ha sido cancelado".
     */
    public static String CANCELADO = "CANCELADO";
    
     /**
     * Id del pago
     */
    private long id;
    
     /**
     * Indica el estado en el que se encuentra la transaccion
     */
    private String estadoTransaccion;
    
     /**
     * Fecha en que se realiza el pago
     */
    private Date fecha; 
    
    
    /**
     * Retorna el id del pago.
     * @return id de pago.
     */
    public long getID(){
        return id;
    }
    
    /**
     * Retorna el estado de transaccion.
     * @return estado de transaccion.
     */
    public String getEstadoTransaccion(){
        return estadoTransaccion;
    }
    /**
     * Retorna la fecha del pago.
     * @return fecha.
     */
    public Date getFecha(){
        return fecha;
    }
     /**
     * Establece el id del pago.
     * @param id.
     */
    public void setId(long id){
        this.id = id;
    }
     /**
     * Establece el  estado de la transaccion.
     * @param estado Nuevo estado.
     */
    public void setEstadoTransaccion(String estado)
    {
        this.estadoTransaccion = estado;
    }
    /**
     * Establece la fecha dada.
     * @param pFecha fecha.
     */
    public void setFecha (Date pFecha){
        this.fecha = pFecha;
    }
}
