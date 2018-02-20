/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.manda2.test.persistence;

import co.edu.uniandes.csw.manda2.entities.PSEEntity;
import co.edu.uniandes.csw.manda2.persistence.PSEPersistence;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

/**
 *
 * @author na.caceres
 */
@RunWith(Arquillian.class)
public class PSEPersistenceTest {
    /**
     * Inyección de la dependencia a la clase EditorialPersistence cuyos métodos
     * se van a probar.
     */
    @Inject
    private PSEPersistence editorialPersistence;

    /**
     * Contexto de Persistencia que se va a utilizar para acceder a la Base de
     * datos por fuera de los métodos que se están probando.
     */
    @PersistenceContext
    private EntityManager em;
    /**
     * Prueba para crear un Editorial.
     *
     *
     */
    @Test
    public void createEditorialTest() {
        PodamFactory factory = new PodamFactoryImpl();
        PSEEntity newEntity = factory.manufacturePojo(PSEEntity.class);
        PSEEntity result = editorialPersistence.create(newEntity);

        Assert.assertNotNull(result);

        PSEEntity entity = em.find(PSEEntity.class, result.getId());

        Assert.assertEquals(newEntity.getId(), entity.getId());
    }
}
