/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author 50494
 */
public class Ejercicio2 {
    
    /// color 
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia;
        
        //definimos los dias de semana por un numero x
        System.out.println("Ingrese un dia de la semana");
        System.out.println(" 1. Lunes\n 2. Martes\n 3. Miercoles\n 4. Jueves\n 5.Viernes\n 6. Sabado\n 7. Domingo\n 8. Salir");
        dia = entrada.nextInt();
        
        //si el dia es diferente al 8, entonces el programa nos dira que es un dia laboral y ahi definimos cuales dias son laborales
        while(dia != 8){
            if (dia == 1 || dia == 2 || dia == 3 || dia == 4 || dia == 5){
                System.out.println(ANSI_BLUE+ "DIA LABORAL");
            }
            else{////este "else" significa si el numero es diferente que 1-5 entonces es NO LABORAL.
        
            System.out.println(ANSI_RED+"DIA NO LABORAL");
        }
        
        System.out.println("Ingrese el numero del dia a elegir: ");
        System.out.println("1. Lunes\n2. Martes\n3. Miercoles\n4. Jueves\n5. Viernes\n6. Sabado\n7. Domingo\n8. Salir");
        dia = entrada.nextInt(); 
            System.out.println(" ");
           
        }
        if (dia==8){
            System.out.println("Gracias por participar");
        }
       
        
       
    }
    
}
