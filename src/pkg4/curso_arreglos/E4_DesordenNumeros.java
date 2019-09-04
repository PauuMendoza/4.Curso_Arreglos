/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.curso_arreglos;

import java.util.Scanner;

/**
 *
 * @author Paulina
 * Ejercicio 4: Leer 10 nùmeros enteros, guardarlos en un arreglo. Debemos
 * mostrarlos en el siguiente orden: EL PRIMERO, EL ULTIMO, EL TERCERO, ETC.
 */
public class E4_DesordenNumeros {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        
        int array[]=new int[10];
        
        
        System.out.println("DISORDER OF NUMBERS");
        for(int i=0;i<10;i++){
            System.out.print((i+1)+". Enter a number: ");
            array[i]=input.nextInt();      
        }
        
        System.out.println("\n\nRESULT");
       
        for(int i=0;i<5;i++){
            System.out.print(array[i]+" ");
            System.out.print(array[9-i]+" ");
        }
        
        
      
    }
        
      
}
