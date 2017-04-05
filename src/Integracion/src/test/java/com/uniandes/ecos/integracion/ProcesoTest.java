/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Conceptos Avanzados de Ingeniería de Software
 *
 * Proyecto Integracion
 * Tarea 5
 * Autor: Johann De Jesus Olaya Herrera
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package com.uniandes.ecos.integracion;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johann
 */
public class ProcesoTest {
    double x1;
    double x2;
    int dof;
    int cantidadSegmentos;
    Proceso proceso ;
    
    @Before
    public void setUp() {
        proceso = new Proceso();
        proceso.cargarEscenario1();
    }

    /**
     * Test of obtenerResultado method, of class Proceso.
     */
    @Test
    public void testObtenerResultado() {
        System.out.println("obtenerResultado");
        double expResult = 0.35006;
        double result = proceso.obtenerResultado();
        assertTrue(expResult == result);
    }
    
}
