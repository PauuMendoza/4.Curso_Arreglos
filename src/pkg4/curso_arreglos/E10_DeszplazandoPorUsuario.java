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
 * EJERCICIO 10: Crear un programa que lea por teclado una tabla de 10 nùmeros
 * enteros y desplaze N pocisiones en el arreglo (N es digitado por el usuario).
 */
public class E10_DeszplazandoPorUsuario {
    
     public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        
        int positions, round=0;
        int array[]=new int[10];
        
        System.out.println("**ENTER THE DATA**");
        for(int index=0;index<array.length;index++){
            System.out.print((index+1)+". Enter the number: ");
            array[index]=input.nextInt();
        }
        
        System.out.println("Enter the number of positions: ");
        positions=input.nextInt();
        
        //for(int vuelta=1;vuelta<=postions;vuelta++) - funciona
        while(round!=positions){
            int last=array[9];
            
            for(int index=8;index>=0;index--){
                array[index+1]=array[index];
            }
            array[0]=last;
            round++;
        }
         
         
        for(int index=0;index<array.length;index++){
            System.out.println((index+1)+".-"+array[index]);
             
        }
    
    }
        
}

