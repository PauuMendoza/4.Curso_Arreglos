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
        
        int array[]=new int[10];
        int copia[]=new int[10];
        int last=0;
        
        
        System.out.println("***ENTER THE DATA***");
        for(int index=0;index<array.length;index++){
            System.out.print((index+1)+". Enter a number: ");
            array[index]=input.nextInt();
        }
        
        last=array[9];
        for(int index=0;index<=8;index++){
            copia[index+1]=array[index];    
        }
        //true solution
        /*for(i=8;i>=0;i++){
        array[index+1]=array[index]
        */
        
        copia[0]=last;       
        
        System.out.println("***SOLUTION**");
        for(int index=0;index<copia.length;index++){
            System.out.println((index+1)+".- "+copia[index]);
        }
        
        
    }
    
}
