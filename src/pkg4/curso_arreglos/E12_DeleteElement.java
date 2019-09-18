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
 * Ejercicio 12: Leer por teclado una tabla de 10 elementos nùmericos enteros y
 * una pocisiòn (entre 0 y 9). Eliminar el elemento situado en la pocisiòn dada
 * sin dejar huecos.
 */
public class E12_DeleteElement {
    
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        
        int array[]=new int[5];
        int one=1, position, limI=0, limS=4;
        
        System.out.println("**ENTER THE DATA**");
        for(int index=0;index<array.length;index++){
            System.out.print((index+one)+". Enter a number: ");
            array[index]=input.nextInt();
        }
        
        System.out.println("**POSITION**");
        do{
            System.out.println("Enter a position from 0 to 4: ");
            position=input.nextInt();
        }while(position<limI || position>limS);
        
      
        for(int index=position;index<array.length-one;index++){
            array[index]=array[index+one];
        }
    
        System.out.println("**RESULT**");
        for(int index=0;index<array.length-one;index++){
            System.out.println(array[index]);
        }
    
    } 
    
}
