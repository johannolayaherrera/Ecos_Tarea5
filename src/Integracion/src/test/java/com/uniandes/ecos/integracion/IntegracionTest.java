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
public class IntegracionTest {
    double x1;
    double x2;
    int dof;
    int cantidadSegmentos;
    Integracion integracion ;
    
    @Before
    public void setUp() {
        x1 = 0;
        x2 = 1.1;
        dof = 9 ;
        cantidadSegmentos = 10;
        integracion = new Integracion(x1,x2,cantidadSegmentos,dof);
    }

    /**
     * Test of asignarXi method, of class Integracion.
     */
    @Test
    public void testAsignarXi() {
        System.out.println("asignarXi");
        double expResult = 1.1;
        double result = integracion.getTablaCalculo().get(integracion.getTablaCalculo().size()-1).getXi();
        assertTrue(expResult == result);
    }

    /**
     * Test of asignarMultiplicador method, of class Integracion.
     */
    @Test
    public void testAsignarMultiplicador() {
        System.out.println("asignarMultiplicador");
        double expResult = 4;
        double result = integracion.getTablaCalculo().get(integracion.getTablaCalculo().size()-2).getMultiplicador();
        assertTrue(expResult == result);
    }

    /**
     * Test of calculoPaso1 method, of class Integracion.
     */
    @Test
    public void testCalculoPaso1() {
        System.out.println("calculoPaso1");
        integracion.calculoPaso1();
        double tolerancia = 0.00008;
        double expResult = 0.53221;
        double result = integracion.getTablaCalculo().get(integracion.getTablaCalculo().size()-1).getCalculo1();
        assertTrue((expResult - tolerancia < result)&&(result < expResult + tolerancia));
    }

    /**
     * Test of calculoPaso2 method, of class Integracion.
     */
    @Test
    public void testCalculoPaso2() {
        System.out.println("calculoPaso2");
        integracion.calculoPaso1();
        integracion.calculoPaso2();
        double tolerancia = 0.00008;
        double expResult = 0.20652;
        double result = integracion.getTablaCalculo().get(integracion.getTablaCalculo().size()-1).getCalculoFuncion();
        assertTrue((expResult - tolerancia < result)&&(result < expResult + tolerancia));
    }

    /**
     * Test of calculoPaso3 method, of class Integracion.
     */
    @Test
    public void testCalculoPaso3() {
        System.out.println("calculoPaso3");
        integracion.calculoPaso1();
        integracion.calculoPaso2();
        integracion.calculoPaso3();
        double tolerancia = 0.00008;
        double expResult = 0.00757;
        double result = integracion.getTablaCalculo().get(integracion.getTablaCalculo().size()-1).getCalculo3();
        assertTrue((expResult - tolerancia < result)&&(result < expResult + tolerancia));
    }

    /**
     * Test of calcularGamma method, of class Integracion.
     */
    @Test
    public void testCalcularGamma() {
        System.out.println("calcularGamma");
        double tolerancia = 0.00008;
        double expResult = 0.388035;
        double result = integracion.calcularGamma();
        assertTrue((expResult - tolerancia < result)&&(result < expResult + tolerancia));
    }

    /**
     * Test of calcularFactorial method, of class Integracion.
     */
    @Test
    public void testCalcularFactorial() {
        System.out.println("calcularFactorial");
        double tolerancia = 0.00001;
        double expResult = 24;
        double result = integracion.calcularFactorial(4);
        assertTrue((expResult - tolerancia < result)&&(result < expResult + tolerancia));
    }
    
        /**
     * Test of darResultado method, of class Integracion.
     */
    @Test
    public void testDarResultado() {
        System.out.println("darResultado");
        integracion.calculoPaso1();
        integracion.calculoPaso2();
        integracion.calculoPaso3();
        double tolerancia = 0.00008;
        double expResult = 0.3500589;
        double result = integracion.darResultado();
        assertTrue((expResult - tolerancia < result)&&(result < expResult + tolerancia));
    }
    
}
