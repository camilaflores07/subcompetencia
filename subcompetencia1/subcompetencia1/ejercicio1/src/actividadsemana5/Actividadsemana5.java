/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadsemana5;

import java.util.Scanner;


public class Actividadsemana5 {

   
    public static void main(String[] args) {
        int cantidadVentas; 
        double total; 
        
    Scanner entrada = new Scanner(System.in); 
    double suma = 0; 
    //suma la inicializamos en 0 ya que utilizamos i++, y esto significa que le va air sumando 1, entonces 0+1=1 y sucesivamente
    
    System.out.println("Ingresar numero de ventas: ");
    cantidadVentas = entrada.nextInt(); 
    
    //para que se repita la cantidad de ventas y haga la suma
    for (int i = 0; i < cantidadVentas; i++) {
    
        System.out.println("Ingrese el total de cada venta: "+(i+1));
        total = entrada.nextDouble(); 
        suma = suma+total; 
        //hace la suma de las ventas totales
        
       
    }
        System.out.println("el total es: "+suma +" ventas");
        System.out.println("muchas gracias");
        
        
    }
    
}
