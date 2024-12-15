/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author 50494
 */
public class Ejercicio3 {

   
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            //como el 1 no es primo, empezamos a contar desde el 2, entonces el programa nos dara si los numero primos desde el 2 al 100.
            boolean esPrimo = true;
            //utilizamos booleanos por que es true o false
            for (int j = 2; j <= Math.sqrt(i); j++) {
                //utilizamos math.sqrt ya que es una funcion matematica complicada.
                if (i % j == 0) {
                    esPrimo = false;
                    //si no es primo entonces la cadena se rompe
                    break;
                }
            }
            if (esPrimo) {
                ///si es primo entonces se imprime
                System.out.print(i + ", ");
            }
            
        }

       
    }
    
}
