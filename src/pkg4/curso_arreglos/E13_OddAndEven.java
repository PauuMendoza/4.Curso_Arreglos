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
      
        int countO=0, countE=0;
        
        for(int index=0;index<array.length;index++){
            if((array[index]%2)==0){
                countO++;
            }else{
                countE++;
            }
            
        }
        System.out.println("ODD: "+countO);
        System.out.println("EVEN: "+countE);
        
        int arrayOdd[]=new int[countO];
        int arrayEven[]=new int[countE];
        
        
        int x=0, contNu=0, cont=0;
        for(int index=0;index<array.length;index++){
            if((array[index]%2)==0){
                arrayOdd[index]=array[index];
                System.out.println("eres par"+ arrayOdd[index]);
                
            }else{
                arrayEven[index]=array[index];
                System.out.println("eres inpar"+ arrayEven[index]);
                x++;
            }
            
        }
        
        for(int index=0;index<arrayOdd.length;index++){
            System.out.print(arrayOdd[index]+" ");
            
            
        }
        for(int index=0;index<arrayEven.length;index++){
            System.out.print(arrayEven[index]+" ");
            
            
        }
        
        
        
        
    }
            
    
    
    
}
