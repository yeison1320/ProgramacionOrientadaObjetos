/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package udecaldas.edu.co.vehiculos;

/**
 *
 * @author yeiso
 */
public class Vehiculos {
    private static int VehiculosTotales = 0;
    private static int KilometrosTotales =0;
    private int KilometrosRecorridos = 0;
    
    public Vehiculos(){ 
    VehiculosTotales++;
    }
    public void andar(int distancia){
    KilometrosRecorridos += distancia;
    KilometrosTotales += distancia;
    }

    /**
     * @return the VehiculosTotales
     */
    public static int getVehiculosTotales() {
        return VehiculosTotales;
    }

    /**
     * @return the KilometrosTotales
     */
    public static int getKilometrosTotales() {
        return KilometrosTotales;
    }

    /**
     * @return the KilometrosRecorridos
     */
    public int getKilometrosRecorridos() {
        return KilometrosRecorridos;
    }   
}
