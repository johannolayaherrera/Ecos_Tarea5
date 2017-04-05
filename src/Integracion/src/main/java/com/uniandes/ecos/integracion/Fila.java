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

import java.util.ArrayList;

/**
 * Clase que modelo una fila de la tabla de calculos
 * @author Johann
 */
public class Fila {
    private double xi;
    private int multiplicador;
    private double calculo1;
    private double calculoFuncion;
    private double calculo3;
    
    /**
     * Guarda el valor de xi que corresponde al valor de xi
     * @param nuevoXi 
     */
    public void setXi(double nuevoXi) {
        xi=nuevoXi;
    }
    /**
     * Guarda el multiplicador de la regla Simpson
     * @param nuevoMultiplicador 
     */
    public void setMultiplicador(int nuevoMultiplicador) {
        multiplicador = nuevoMultiplicador;
    }
    /**
     *  Guarda el resultado del primer proceso de la regla Simpson
     * @param nuevoCalculo1 
     */
    public void setCalculo1(double nuevoCalculo1) {
        calculo1 = nuevoCalculo1;
    }
    /**
     * Guarda el valor de la funcion para ese registro
     * @param nuevoCalculoFuncion 
     */
    public void setCalculoFuncion(double nuevoCalculoFuncion) {
        calculoFuncion = nuevoCalculoFuncion;
    }
    /**
     * Guarda el resultado del resultado de la regla de Simpson
     * @param nuevoCalculo3 
     */
    public void setCalculo3(double nuevoCalculo3) {
        calculo3 = nuevoCalculo3;
    }
    /**
     * Obtiene el valor de xi
     * @return xi
     */
    public double getXi() {
        return xi;
    }
    /**
     * Obtiene el valor del multiplicador
     * @return multiplicador
     */
    public int getMultiplicador() {
        return multiplicador;
    }
    /**
     * Obtiene el valor del calculo 1
     * @return Primero calculo de la regla de Simpson
     */
    public double getCalculo1() {
        return calculo1;
    }
    /**
     * Obtiene el valor de la función
     * @return valor del resultado de la función
     */
    public double getCalculoFuncion() {
        return calculoFuncion;
    }
    /**
     * Obtiene el valor total de la regla de Simpson
     * @return 
     */
    public double getCalculo3() {
        return calculo3;
    }
}
