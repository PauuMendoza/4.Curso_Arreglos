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
 * Ejercicio 9: Crear un programa que lea por teclado una tabla de 10 nùmeros
 * enteros y la desplace una pocisiòn hacia abajo: el primero pasa a ser el 
 * segundo, el segundo pasa a ser el tercero y asi sucesivamente. El ùltimo pasa
 * a ser el primero.
 * 
 */
public class E9_IntercambiandoPocisiones {
    
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        
        int array[]=new int[5];
        int ultimo=0;
        
        
        System.out.println("***ENTER THE DATA***");
        for(int index=0;index<5;index++){
            System.out.print((index+1)+". Enter a number: ");
            array[index]=input.nextInt();
        }
        
        int temporal;
        for(int index=0;index<=4;index++){
            ultimo=array[4];
            temporal=array[index];
            array[index+1]=array[index];
            
            
        }
        
        for(int index=0;index<=4;index++){
            System.out.println(array[index]);
        }
        
        
    }
    
}
