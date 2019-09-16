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
 * Ejercicio 11: Leer 5 elementos nùmericos que se introduciràn ordenados de
 * forma creciente. Èstos los guardaremos en una tabla de tamaño 10. Leer un
 * nùmero N, e insertarlo en el lugar adecuado para que la tabla continùe ordenada.
 */
public class E11_InsertarNumeroOrdenado {
    
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        
        int array[]=new int[10];
        int value=0, index, numb,one=1, user_numbers=5, total_numbers=6;
        boolean solution=true;
        
        
        System.out.println("**ENTER THE DATA**");
        for(index=0;index<user_numbers;index++){
            System.out.print((index+one)+". Enter a number: ");
            array[index]=input.nextInt();
            while(array[index]<value){
                System.out.print((index+one)+". Enter other number: ");
                array[index]=input.nextInt();
            }
            value=array[index];
        }
        
        System.out.println("**NEW VALOR**");
        System.out.println("Enter a number: ");
        numb=input.nextInt();
        
       
      
        for(int index2=4;index2>=0;index2--){
            if(array[index2]>numb){
                array[index2+1]=array[index2];
            }else if(solution){
                array[index2+1]=numb;
                solution=false;
            }
        }
      
        for(int index2=0;index2<total_numbers;index2++){
            System.out.println((index2+one)+".-"+array[index2]);
             
        }
    }
}
