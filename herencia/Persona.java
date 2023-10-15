/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author yeiso
 */
public class Persona {
    private String Nombre;
    private String FechaDeNacimiento;
    //constructor
    public Persona (String Nombre,String FechaDeNacimiento ){
        this.Nombre = Nombre;
        this.FechaDeNacimiento = FechaDeNacimiento;
    }
    public void dormir(){
        System.out.println(getNombre() + " Esta durmiendo");
    
  }
    public void respirar(){
        System.out.println(getNombre() + " Esta respirando");
    
  }  
    public void comer(){
        System.out.println(getNombre() + " Esta comiendo");
    
  }

    /**
     * @return the FechaDeNacimiento
     */
    public String getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    /**
     * @param FechaDeNacimiento the FechaDeNacimiento to set
     */
    public void setFechaDeNacimiento(String FechaDeNacimiento) {
        this.FechaDeNacimiento = FechaDeNacimiento;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
