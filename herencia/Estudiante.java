/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author yeiso
 */
public class Estudiante extends Persona{
    private long codigo; 
    public Estudiante (String Nombre,String FechaDeNacimiento,long codigo){
        super(Nombre, FechaDeNacimiento);
        this.codigo = codigo; 
    }
    
    public void aprobar(){
        System.out.println(getNombre() + " Aprobo");
    }
    public void reprobar(){
        System.out.println(getNombre() + " Reprobo");
}

    /**
     * @return the codigo
     */
    public long getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

}
