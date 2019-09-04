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
 * Ejercicio 1: Leer 5 nùmeros, guardarlos en un arreglo y mostrarlos en el mismo
 * orden introducido.
 */
public class E1_MostrarNumeros {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        float array []= new float [5];
        
        System.out.println("SAVE THE DATA");
        for(int i=0;i<5;i++){
            System.out.print("Enter a number "+(i+1)+": ");
            array[i]=input.nextFloat();
        }
        System.out.println("SOWHING THE RESULT");
        for(float i:array){
            System.out.print(i+" ");
        }
          
    }
    
}
