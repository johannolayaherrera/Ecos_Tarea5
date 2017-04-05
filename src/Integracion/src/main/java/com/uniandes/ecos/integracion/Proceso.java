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

/**
 * Centraliza el proceso de integración
 * @author Johann
 */
public class Proceso {
    private static Integracion integracion1;
    private static Integracion integracion2;
    static double x1 ;
    static double x2 ;
    static int dof ;
    static double E = 0.00001;
    
    /**
     * Carga el primer caso de la prueba
     */
    public static void cargarEscenario1() {
        x1 = 0;
        x2 = 1.1;
        dof = 9;
    }
    /**
     * Carga el segundo caso de la prueba
     */
    public static void cargarEscenario2() {
        x1 = 0;
        x2 = 1.1812;
        dof = 10;
    }
     /**
     * Carga el tercer caso de la prueba
     */
    public static void cargarEscenario3() {
        x1 = 0;
        x2 = 2.75;
        dof = 30;
    }
    /**
     * Retorna el resultado según el escenario cargado previamente
     * @return Resultado de calculo
     */
    public double obtenerResultado() {
        int numSeg = 10;
        double resultado1 = 0;
        double resultado2 = 0;
        
        while (((Math.abs(resultado1-resultado2))>E)||(resultado1==0 && resultado2==0)) {
            integracion1= new Integracion(x1,x2,numSeg,dof);
            resultado1 = integracion1.darResultado();

            integracion2= new Integracion(x1,x2,numSeg*2,dof);
            resultado2 = integracion2.darResultado();
            
            numSeg = numSeg * 2;
        }
        return ((double) Math.round(resultado2*100000) / 100000);
    }
}
