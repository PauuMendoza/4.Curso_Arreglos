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
 * Ejercicio 3: Leer 5 nùmeros por teclado, almacenarlos en un arreglo y a
 * continuaciòn realizar la media de los nùmeros positivos, la media de los
 * negativos y contar el nùmero de ceros.
 */
public class E3_ArregloPromedios {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        float sumP=0,  sumN=0;
        int countP=0,countN=0, count=0;
        
        float numbers []=new float[5];
        
        System.out.println("MEDIUM NUMBERS");
        for(int i=0;i<5;i++){
            System.out.print("Enter the number "+(i+1)+":");
            numbers[i]=input.nextFloat();
            
            if(numbers[i]==0){
                count++;
            }else if(numbers[i]>0){
                sumP+=numbers[i];
                countP++;
            }else{
                sumN+=numbers[i];
                countN++;
            }  
        }
        System.out.println("\n\nTHE RESULT OF THE MEDIUM NUMBERS IS");
        
        if(countP==0){
            System.out.println("Don`t exist positive numbers");
        }else{
            sumP/=countP;
            System.out.println("Media of numbers positives: "+sumP);
        }
        
        if(countN==0){
           System.out.println("Don`t exist positive numbers");
        }else{
            sumN/=countN;
            System.out.println("Media of numbers negatives: "+sumN);
        }
        
        System.out.println("Zeros in stock: "+count);

        
        
        
    }
    
}
