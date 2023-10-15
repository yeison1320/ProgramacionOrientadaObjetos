/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencia;

/**
 *
 * @author yeiso
 */
public class Herencia {

    public static void main(String[] args) {
        Persona persona = new Persona("Yeison", "13/10/2005");
        
        persona.dormir();
        persona.comer();
        persona.respirar();
        
        Estudiante estudiante = new Estudiante("Yeison","13/11.2023",13);
        
        estudiante.dormir();
        estudiante.comer();
        estudiante.respirar();
        estudiante.aprobar();
        estudiante.reprobar();
        
        Empleado empleado = new Empleado("Juan", "15/08/2023", 25000);
        
        empleado.cobrar();
        empleado.trabajar();
        empleado.dormir();
        empleado.respirar();
    }
}
