/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.manda2.dtos;

/**
 *
 * @author dv.gonzalez10
 */
public class ComprasEnTiendaDetailsDTO extends ComprasEnTiendaDTO {
    //atributos
    /**
    *Articulo que se quiere comprar en tienda
    */
    private ArticuloDTO articulo;

   //CONSTRUCTOR

    /**
     * Metodo constructor
     * @param articulo
     * @param costoDeTransporte
     * @param pago
     * @param cliente
     * @param empleado
     * @param id
     * @param nombre
     * @param costo
     * @param puntoDeEncuentro
     * @param puntoDeRealizacion
     * @param exitoDiligencia
     * @param calificacion
     * @param descripcion 
     */
    public ComprasEnTiendaDetailsDTO(ArticuloDTO articulo, Double costoDeTransporte, PagoDTO pago, ClienteDTO cliente, EmpleadoDTO empleado, long id, String nombre, double costo, String puntoDeEncuentro, String puntoDeRealizacion, boolean exitoDiligencia, double calificacion, String descripcion) {
        super(costoDeTransporte, pago, cliente, empleado, id, nombre, costo, puntoDeEncuentro, puntoDeRealizacion, exitoDiligencia, calificacion, descripcion);
        this.articulo = articulo;
    }
    
    
  /**
     *Retorna el articulo 
     * @return costoDeTransporte
     */
    public ArticuloDTO getArticulo() {
        return articulo;
    }

    /**
     * Asigna el articulo 
     * @param articulo 
     */
    public void setArticulo(ArticuloDTO articulo) {
        this.articulo = articulo;
    }
    
    
   
}
