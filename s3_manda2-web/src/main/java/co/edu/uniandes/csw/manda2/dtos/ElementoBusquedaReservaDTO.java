/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.manda2.dtos;

/**
 ** ElementoBusqudReservaDTO servicios de tipo reserva. Los DTO contienen las
 * represnetaciones de los JSON que se transfieren entre el cliente y el
 * servidor. Ésta clase hace parte de la clase OrganizacionDTO
 *
 * Al serializarse como JSON esta clase implementa el siguiente modelo: <br>
 * <pre>
 *   {
 *      "nombre": string,
 *      "exitosa": boolean,
 *      "datosBusqueda": string,
 *     
 *   }
 * </pre> Por ejemplo un servicio de tipo organizacion se representa asi:<br>
 *
 * <pre>
 *
 *   {
 *      "nombre": concierto Justin Bieber,
 *      "exitosa": true,
 *      "datosBusqueda": primera fila con meet and greet,
 *     
 *   }
 *
 * </pre>
 * @author cv.trujillo
 */
public class  ElementoBusquedaReservaDTO 
{

    public ElementoBusquedaReservaDTO(){
        this("", "", false);
    }
    
    public ElementoBusquedaReservaDTO(String nombre, String datosBusqueda, boolean exitosa) {
        this.nombre = nombre;
        this.datosBusqueda = datosBusqueda;
        this.exitosa = exitosa;
    }
    
 
    /**
     * nombre del elemento de busqueda
     * */
    private String nombre;
    
    /**
     * El dato de busqueda, filtro de la reserva que se quiere hcer
     * */

    private String datosBusqueda;
    /**
     * Determina si la busqueda fue exitosa
     * */
    private boolean exitosa;
    
    /**
     * Obtener del nombre del elemento a buscar
     * */
    public String getNombre()
    {
        return nombre;
    }
    /**
     * Obtener los datos del elemento a buscar
     * */
    
    public String getDatos()
    {
        return datosBusqueda;
    }
    
    /**
     * Establecer el nombre del nombre
     * @param nombre a establecer
     * */
    
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    /**
     * Establecer los datos del elemento
     * @param datosBusqueda 
     */
    
    public void setDatos(String datosBusqueda){
        this.datosBusqueda=datosBusqueda;
    }
    /**
     * Indica si el eleme. de busq. es exitoso
     * */
    public boolean isExistosa()
    {
        
        return exitosa;
    }
    
    /**
     * Establecer si es exitosa o no
     * @param para establecer el estado
     * */
    public void setExitosa(boolean exitosa)
    {
        this.exitosa=exitosa;
    }
}
