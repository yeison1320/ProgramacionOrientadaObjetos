/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author yeiso
 */
public class Empleado extends Persona{
private double  sueldo;
public Empleado (String Nombre,String FechaDeNacimiento, double sueldo){
    super(Nombre, FechaDeNacimiento);
    this.sueldo = sueldo;
}
public void trabajar(){
        System.out.println(getNombre() + " trabajo");
        
   }
public void cobrar(){
        System.out.println(getNombre() + " cobro");
}
}