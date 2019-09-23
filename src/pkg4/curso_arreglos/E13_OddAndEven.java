/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.curso_arreglos;

/**
 *
 * @author Paulina
 * Ejercicio 13: Leer 10 enteros en una tabla. Guardar en otra tabla los
 * elementos pares de la primera, y a continuaciòn los elementos impares en otro
 * arreglo.
 */
public class E13_OddAndEven {
    
    public static void main(String args[]){
        
        int array[]={1,2,3,4,5,6,7,8,9,10};
      
        int countOdd=0, countEven=0, indexOdd=0, indexEven=0;
        
        for(int index=0;index<array.length;index++){
            if((array[index]%2)==0){
                countOdd++;
            }else{
                countEven++;
            }
            
        }
        
        int arrayOdd[]=new int[countOdd];
        int arrayEven[]=new int[countEven];
        
        for(int index=0;index<array.length;index++){
            if((array[index]%2)==0){
                arrayOdd[indexOdd]=array[index];
                indexOdd++;
            }else{
                arrayEven[indexEven]=array[index];
                indexEven++;
            }
        }
        
        System.out.println("***ODD NUMBERS**");
        for(int index=0;index<arrayOdd.length;index++){
            System.out.print(arrayOdd[index]+",");
        }
        System.out.println("\n**EVEN NUMBERS**");
        for(int index=0;index<arrayEven.length;index++){
            System.out.print(arrayEven[index]+",");
        }
    }
}
