/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udecaldas.edu.co.vehiculos;

/**
 *
 * @author yeiso
 */
public class Carro extends Vehiculos {
    private int kilometraje;
    public void andar(int distancia) {
        super.andar(distancia);
        this.kilometraje += distancia;
    }
    
    public void Quemarllanta(){
        System.out.println("Quemando llanta con el carro");
    }

    /**
     * @return the kilometraje
     */
    public int getKilometraje() {
        return kilometraje;
    }
    
}
