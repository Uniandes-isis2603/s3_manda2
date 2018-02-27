/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.manda2.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import uk.co.jemos.podam.common.PodamExclude;

/**
 *
 * @author cv.trujillo
 */
@Entity
public class ElementoBusquedaReservaEntity extends OrganizacionEntity implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
      /**
     * nombre del elemento de busqueda
     * */
    @PodamExclude
    private String nombre;
    
    /**
     * El dato de busqueda, filtro de la reserva que se quiere hcer
     * */
    @PodamExclude
    private String datosBusqueda;
    /**
     * Determina si la busqueda fue exitosa
     * */
    
    @PodamExclude
    private Boolean exitosa;
    
    /**
     * Obtener del nombre del elemento a buscar
     * @return nombre retorna el nombre del elemento.
     * */
    
    public String getNombre()
    {
        return nombre;
    }
    /**
     * Obtener los datos del elemento a buscar
     * @return datosBusqueda los datos de la busqueda.
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
     * @param datosBusqueda los datos de la busqueda
     */
    
    public void setDatos(String datosBusqueda){
        this.datosBusqueda=datosBusqueda;
    }
    /**
     * Indica si el eleme. de busq. es exitoso
     * @return exitosa boolean si la busqueda fue exitosa.
     * */
    public Boolean isExistosa()
    {
        
        return exitosa;
    }
    
    /**
     * Establecer si es exitosa o no
     * @param exitosa establecer el estado
     * */
    public void setExitosa(Boolean exitosa)
    {
        this.exitosa=exitosa;
    }
}
