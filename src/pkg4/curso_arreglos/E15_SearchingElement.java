/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 */
package pkg4.curso_arreglos;

import java.util.Scanner;

/**
 *
 * @author Paulina Ejercicio 15: Leer 10 enteros ordenados crecientemente. Leer
 * N y buscarlo en la tabla.Se debe mostrar la pocisiòn donde se encuentra. Si
 * no està, indicarlo con un mensaje.
 */
public class E15_SearchingElement {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int one = 1, now = 0, position = 0;
        boolean solution = false, not_found = false;

        int array[] = new int[10];

        System.out.println("**ENTER THE DATA**");
        for (int index = 0; index < array.length; index++) {
            System.out.print((index + one) + ". Enter the number: ");
            array[index] = input.nextInt();
            while (array[index] < now) {
                System.out.print((index + one) + ". Enter the number: ");
                array[index] = input.nextInt();
            }
            now = array[index];
        }

        System.out.println("****Enter a number to search: ");
        int number = input.nextInt();

        for (int index = 0; index < array.length; index++) {
            if (array[index] == number) {
                position = index;
                solution = true;
            } else {
                not_found = true;
            }
        }

        if (solution) {
            System.out.println("The number exists in the index: " + position);
        } else {
            System.out.println("The number don`t exist in the array");
        }

    }

}
