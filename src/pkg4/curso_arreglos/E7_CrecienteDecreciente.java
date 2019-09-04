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
 * Ejercicio 7: Leer por teclado una serie de 10 nùmeros enteros. La aplicaciòn
 * debe indicarnos si los nùmeros estan ordenados en forma creciente, decreciente,
 * desordenados o si son iguales.
 */
public class E7_CrecienteDecreciente {
    
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        
        int array[]=new int[5];
        
        System.out.println("***ENTER THE DATA***");
        for(int index=0;index<5;index++){
            System.out.print("Enter the number "+(index+1)+":");
            array[index]=input.nextInt();
        }
        
        System.out.println("***INCREASING AND DECREASING***");
        boolean increasing=false, decreasing=false, same=false, disorder=false; 
        int countI=0, countD=0, count=0;
        for(int index=0;index<array.length-1;index++){
            if((array[index + 1] - array[index])>0){
                countI++;
                if(countI==array.length-1){
                increasing=true;
                }
            }else if((array[index]-array[index+1])>0){
                countD++;
                if(countD==array.length-1){
                    decreasing=true;
                }
            }else if((array[index]-array[index+1])==0){
                count++;
                if(count==array.length-1){
                    same=true;
                }
            }else{
                disorder=false;
            }
            
        }
        
        if(increasing==true){
            System.out.println("The array is INCREASING");
        }else if(decreasing==true){
            System.out.println("The array is DECREASING");
        }else if(same==true){
            System.out.println("All array elements are EQUALS");
        }else if(disorder=true){
            System.out.println("All the elements of array are in DISORDER");
        }
        
        /*
        //OLD CODE, FUNCTIONAL BUT INCORRECT
        System.out.println("***INCREASING AND DECREASING***");
        int mayor=0, index=0,count=0;
        
        for(index=0;index<5;index++){
            if(array[index]>mayor){
                mayor=array[index];
                count++;
            }
            
             
        }}*/
     
       
    
       
       
    
    } 
}
