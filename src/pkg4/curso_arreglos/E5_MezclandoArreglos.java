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
 * Ejercicio 5: Leer por teclado 2 tablas de dos nùmeros enteros y mezclarlas en
 * una tercera de la forma: el 1º de A, el 1º de B, el 2º de A y el 2º de B, etc.
 */
public class E5_MezclandoArreglos {
    
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        
        int elementos=0;
        
        int A[]=new int[5];
        int B[]=new int[5];
        int N[]=new int[10];
        
        System.out.println("ENTER ALL THE ELEMETS FOR THE ARRAY A ");
        for(int i=0;i<5;i++){
            System.out.print("Enter number "+(i+1)+":");
            A[i]=input.nextInt();
        }
        
        System.out.println("ENTER ALL THE ELEMETS FOR THE ARRAY B ");
        for(int i=0;i<5;i++){
            System.out.print("Enter number "+(i+1)+":");
            B[i]=input.nextInt();
        }
        System.out.println("\n\npruebas");
        
      
        int p=0;
        for(int i=0;i<5;i++){
            N[p]=A[i];
            p++;
            N[p]=B[i];
            p++;
        }
        
        for(int i=0;i<N.length;i++){
            System.out.println(N[i]);
        }
    
}}
/*
        for(int i=1;i<10;i+=2){
            N[1]=B[0]; 
           
        }*/