/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.manda2.dtos;

import co.edu.uniandes.csw.manda2.entities.BilleteraEntity;
import co.edu.uniandes.csw.manda2.entities.MedioPagoEntity;
import co.edu.uniandes.csw.manda2.entities.PSEEntity;
import co.edu.uniandes.csw.manda2.entities.PagoEntity;
import co.edu.uniandes.csw.manda2.entities.PayPalEntity;
import co.edu.uniandes.csw.manda2.entities.TarjetaCreditoEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que extiende de {@link BilleteraDTO} para manejar la transformacion entre
 * los objetos JSON y las Entidades de la base de datos. Para conocer el
 * contenido de la ciudad vaya a la documentacion de {@link BilleteraDTO}
 *
 * @author m.moreno
 */
public class BilleteraDetailDTO extends BilleteraDTO {

    /**
     * Medio de pago para realizar la transaccion
     */
    private List<MedioPagoDTO> medioPago;

    //Constructor

    /**
     * Constructor por defecto
     */
    public BilleteraDetailDTO() {
        super();
    }

    /**
     * Constructor para transformar un Entity a un DTO
     *
     * @param entity La entidad de ciudad a partir de la cual se construye el
     *               objeto
     */

    public BilleteraDetailDTO(BilleteraEntity entity) {
        super(entity);
        if (entity != null) {
            if (entity.getMedioPago() != null) {
                this.medioPago = new ArrayList<>();
                for (MedioPagoEntity entityMedio : entity.getMedioPago()) {
                    if (entityMedio instanceof PayPalEntity) {
                        medioPago.add(new PayPalDTO((PayPalEntity) entityMedio));
                    } else if (entityMedio instanceof TarjetaCreditoEntity) {
                        medioPago.add(new TarjetaCreditoDTO((TarjetaCreditoEntity) entityMedio));
                    } else if (entityMedio instanceof PSEEntity) {
                        medioPago.add(new PSEDTO((PSEEntity) entityMedio));
                    }
                }
            }
        }
//if(entity !=  null){
//             if(entity.getMedioPago()!= null){
//                 this.medioPago = new MedioPagoDTO(entity.getMedioPago());
//             }         
//         }


    }


    /**
     * Retorna el medio de pago.
     *
     * @return Medio de pago con el que se realizara la transaccion.
     */
    public List<MedioPagoDTO> getMedioPago() {
        return medioPago;
    }

    /**
     * Asigna el medio de pago con el que se realizara la transaccion.
     *
     * @param pMedioPago con el que se realizara la transaccion.
     */
    public void setMedioPago(List<MedioPagoDTO> pMedioPago) {
        this.medioPago = pMedioPago;
    }

    public BilleteraEntity toEntity() {
        BilleteraEntity billeteraEntity = super.toEntity();
        if (medioPago != null) {
            List<MedioPagoEntity> medioPagoEntity = new ArrayList<>();
            for (MedioPagoDTO dtoMedioPago : medioPago) {
                medioPagoEntity.add(dtoMedioPago.toEntity());
            }
            billeteraEntity.setMedioPago(medioPagoEntity);
            System.out.println(medioPagoEntity);
        }
        return billeteraEntity;
//if (medioPago != null) {
//            billeteraEntity.setMedioPago(medioPago.toEntity());
//        }
//        return billeteraEntity;
//      }


    }
}