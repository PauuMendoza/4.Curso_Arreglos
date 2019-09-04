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
 * Ejercicio 6: Leer los datos correspondientes a dos tablas de 12 elementos
 * nùmericos, y mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B,
 * otros 3 de la A, otros 3 de la B, etc.
 */
public class E6_PasandoDatos {
    
    public static void main(String [] args){
        
        Scanner input=new Scanner(System.in);
        
        int A[]=new int[6];
        int B[]=new int[6];
        int C[]=new int[12];
        
        System.out.println("****RECORDING DATA****");
        
        System.out.println("\n----ARRAY A----");
        for(int i=0;i<6;i++){
            System.out.print("Enter the number "+(i+1)+" for the array A:");
            A[i]=input.nextInt();
        }
        
        System.out.println("\n----ARRAY B----");
        for(int i=0;i<6;i++){
            System.out.print("Enter the number "+(i+1)+" for the array B:");
            B[i]=input.nextInt();
        }
        
        System.out.println("***RESULT****");
        
        int p=0, i=0, z=0;
        while(i<6){
            for(z=0;z<3;z++){
                C[p]=A[z+i];
                p++;
            }
            for(z=0;z<3;z++){
                C[p]=B[z+i];
                p++;
            }
            i+=3;
        }
  
       
        for(int x=0;x<C.length;x++){
           System.out.println(C[x]);
        }
   
    }
    
}
