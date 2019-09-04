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
 * Ejercicio 8: Diseñar una aplicacion que declare una tabla de 10 elementos enteros.
 * Leer mediante el teclado 8 numeros. Despuès se debe de pedir un nùmero y una
 * pocisiòn, insertarlo en la pocisiòn indicada, desplazando los que estèn detràs.
 */
public class E8_DesplazandoPocisiones {
    
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        
        int array[]=new int[5];
        //int copia[]=new int[5];
        int number, pos;
        
        System.out.println("***ENTER THE DATA***");
        for(int index=0;index<3;index++){
            System.out.print((index+1)+". Enter a number: ");
            array[index]=input.nextInt();
        }
        
        System.out.println("***USER DATA***");
        System.out.print("Enter the number you wish insert: ");
        number=input.nextInt();
        System.out.print("Enter the pocision: ");
        pos=input.nextInt();
        
        //TRUE SOLUTION
        for(int index=2;index>=pos;index--){
            array[index+1]=array[index];
            
        }
        
        array[pos]=number;
        
        for(int index=0;index<4;index++){
            System.out.println(index+ ". "+array[index]);
        }
        
        
        
        
        /*
        System.out.println("***SOLCUION***");
        int temporal=0;
        for(int index=0;index<=array.length;index++){
            //System.out.println(pos+" y " + index);
            if(index==pos){
                temporal=array[index];
                array[pos]=number;
                array[index+1]=temporal;
            }
    
        }
        System.out.println("TEMPORAL = "+temporal);
        */
        
        /*
        
        System.out.println("***SOLCUION***");
        int temporal=0;
        
        for(int x=0;x<=copia.length;x++){
            
            //System.out.println(pos+" y " + x);
            for(int index=0;index<=array.length-1;index++){
                
                //System.out.println(pos+" y " + index);
                if(pos==index){
                    temporal=array[index];
                    copia[x]=number;
                   // copia[x+1]=temporal;
                    //copia[x+1]=temporal;//ERROR
        
                     
                }
                else{
                    copia[x]=array[index];
                }
                
                
               
           if(x==4){
                 System.out.println(copia[x]);
                    

            }
         
            }   
        
        }
        
        
        /*
        
        System.out.println("***SOLCUION!!!!!!!!!!!!!!!!***");
        for(int index=0;index<array.length;index++){
                     System.out.println(array[index]);
                     

        }
    */
    
}}
