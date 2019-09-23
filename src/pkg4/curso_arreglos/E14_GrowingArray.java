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
 * Ejercicio 14: Leer dos series de 10 enteros, que estaràn ordenados crecientemente.
 * Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.
 */
public class E14_GrowingArray {
    
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        
        int arrayA[]=new int[5];
        int arrayB[]=new int[5];
        int arrayFinal[]=new int[10];
        int one=1, actuallyA=0, actuallyB=0;
        
        System.out.println("**ENTER THE DATA FOR THE ARRAY A**");
        for(int indexA=0;indexA<arrayA.length;indexA++){
            System.out.print((indexA+one)+". Enter the number: ");
            arrayA[indexA]=input.nextInt();
            while(arrayA[indexA]<actuallyA){
                System.out.print((indexA+one)+". Enter the number: ");
                arrayA[indexA]=input.nextInt();
            }
            actuallyA=arrayA[indexA];
        }
        System.out.println("**ENTER THE DATA FOR THE ARRAY B**");
        for(int indexB=0;indexB<arrayB.length;indexB++){
            System.out.print((indexB+one)+". Enter the number: ");
            arrayB[indexB]=input.nextInt();
            while(arrayB[indexB]<actuallyB){
                System.out.print((indexB+one)+". Enter the number: ");
                arrayB[indexB]=input.nextInt();
            }
            actuallyB=arrayB[indexB];
        }
        
        //ORDERING THE ARRAY
        int indexOdd=0, indexEven=0, indexFinal=0, limit=2, last_position=4;
        for(indexFinal=0;indexFinal<arrayFinal.length-limit;indexFinal++){
            if(arrayA[indexOdd]<arrayB[indexEven]){
                arrayFinal[indexFinal]=arrayA[indexOdd];
                indexOdd++;
            }
            else{
                arrayFinal[indexFinal]=arrayB[indexEven];
                indexEven++;
            }
        }
        
        if(arrayA[last_position]<arrayB[last_position]){
            arrayFinal[indexFinal]=arrayA[last_position];
            arrayFinal[indexFinal+one]=arrayB[last_position];
        }
        else{
            arrayFinal[indexFinal]=arrayB[last_position];
            arrayFinal[indexFinal+one]=arrayA[last_position];
        }
        
        System.out.println("***RESULT***");
        for(int index=0;index<arrayFinal.length;index++){
            System.out.println(arrayFinal[index]);
        }
    }
    
}
