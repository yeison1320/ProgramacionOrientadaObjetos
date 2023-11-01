/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udecaldas.edu.co.vehiculos;
import java.util.Scanner;
/**
 *
 * @author yeiso
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Vehiculos vehiculos = null;
        
        
        while(true){
            System.out.println("Elija una opcion:");
            System.out.println("1. ir en bicicleta");
            System.out.println("2. ir en carro");
            System.out.println("3. leer kilometraje en bicicleta");
            System.out.println("4. leer kilometraje en carro");
            System.out.println("5. ver kilometraje total");
            System.out.println("6. salir");
            
            int opcion = scanner.nextInt();
            
            if(opcion == 6 ){
                break;
            }
            if(opcion==1){
                vehiculos = new Bicicleta();
            }
            else if(opcion==2){
                vehiculos = new Carro();
            }
            else if(opcion == 3){
                System.out.println("El kilometraje de la bicicleta es: " + ((Bicicleta) vehiculos).getKilometraje());
                continue;
            } 
            else if(opcion == 4){
                System.out.println("El kilometraje del carro es: " + ((Carro) vehiculos).getKilometraje());
                continue;
            }
            else if(opcion ==5){
                System.out.println("Kilómetros totales recorridos por todos los vehículos: " + Vehiculos.getKilometrosTotales());
                continue;
            }

            else{
                System.out.println("Opcion incorrecta");
                continue;
            }
            
            while(true){
                System.out.println("1. Andar ");
                System.out.println(vehiculos instanceof Bicicleta ? "2. Picar" : "2. Quemar llanta" );
                System.out.println("3. Volver al menu princiopal");
                
                int subOpcion = scanner.nextInt();
                
                if(subOpcion == 3){
                    break;
                }
                
                 if (subOpcion == 1) {
                    System.out.print("Ingrese la distancia a recorrer: ");
                    int distancia = scanner.nextInt();
                    vehiculos.andar(distancia);
                    System.out.println("Ha recorrido " + distancia + " kilómetros.");
                } else if (vehiculos instanceof Bicicleta && subOpcion == 2) {
                    ((Bicicleta) vehiculos).picar();
                } else if (vehiculos instanceof Carro && subOpcion == 2) {
                    ((Carro) vehiculos).Quemarllanta();
                } else {
                    System.out.println("Opción no válida.");
                }
            }
        }

        scanner.close();
    }
 }
