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
 * Ejercicio 15: Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en
 * la tabla.Se debe mostrar la pocisiòn donde se encuentra. Si no està, indicarlo
 * con un mensaje.
 */
public class E15_SearchingElement {
    
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        
        int one=1, now=0;
        
        int array[]=new int[10];
        
        System.out.println("**ENTER THE DATA**");
        for(int index=0;index<array.length;index++){
            System.out.print((index+one)+". Enter the number: ");
            array[index]=input.nextInt();
            while(array[index]<now){
                System.out.print((index+one)+". Enter the number: ");
                array[index]=input.nextInt();
            }
            now=array[index];
        }
        
        System.out.println("****Enter a number to search: ");
        int number=input.nextInt();
        
        for(int index=0;index<array.length;index++){
            if(array[index]==number){
                System.out.println("lo encontramos en el indice "+index);
                break;
            }else{
                System.out.println("ese numero no se encuentra");
            }
        }
        
    }
    
    
    
}
