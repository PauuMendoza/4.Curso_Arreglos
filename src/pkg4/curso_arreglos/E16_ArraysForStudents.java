/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.curso_arreglos;

import java.util.Scanner;

/**
 *
 * @author Paulina E16: Queremos desarrollar una aplicaciòn que nos ayude a
 * gestionar las notas de un centro educativo. Cada grupo (o clase) esta
 * compuesto por 5 alumnos. Se pide leer las notas del primer, segundo y tercer
 * trimestre de un grupo.
 *
 * Debemos mostrar al final: la nota media del grupo por cada trimestre, y la
 * media del alumno que se encuentra en la posiciòn N (N se lee por teclado).
 */
public class E16_ArraysForStudents {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        float first[] = new float[5];
        float second[] = new float[5];
        float third[] = new float[5];

        int one = 1, limI = 0, limS = 10, students = 5, numb_semester = 3;//variables not harcode
        int indexF, countF = 0, indexS, indexT;//index's and count's
        float sumF = 0, sumS = 0, sumT = 0, meanF = 0, meanS = 0, meanT = 0, alumn_sum, alumn__mean;//variables for operations

        System.out.println("***NOTES FOR THE FIRST GROUP***");
        for (indexF = 0; indexF < first.length; indexF++) {
            System.out.print((indexF + one) + ". Enter the note for the alumn: ");
            first[indexF] = input.nextFloat();
            while (first[indexF] < limI || first[indexF] > limS) {
                System.out.print((indexF + one) + ". Enter the note for the alumn: ");
                first[indexF] = input.nextFloat();
            }
            sumF += first[indexF];
            meanF = sumF / students;
        }
        System.out.println("***NOTES FOR THE SECOND GROUP***");
        for (indexS = 0; indexS < second.length; indexS++) {
            System.out.print((indexS + one) + ". Enter the note for the alumn: ");
            second[indexS] = input.nextFloat();
            while (second[indexS] < limI || first[indexS] > limS) {
                System.out.print((indexF + one) + ". Enter the note for the alumn: ");
                second[indexS] = input.nextFloat();
            }
            sumS += second[indexS];
            meanS = sumS / students;
        }
        System.out.println("***NOTES FOR THE THIRD GROUP***");
        for (indexT = 0; indexT < third.length; indexT++) {
            System.out.print((indexT + one) + ". Enter the note for the alumn: ");
            third[indexT] = input.nextFloat();
            while (third[indexT] < limI || third[indexT] > limS) {
                System.out.print((indexT + one) + ". Enter the note for the alumn: ");
                third[indexT] = input.nextFloat();
            }
            sumT += third[indexT];
            meanT = sumT / students;
        }

        System.out.println("***MEAN OF THE ALUMN***");
        System.out.println("Enter the student`s position: ");
        int position = input.nextInt();

        alumn_sum = first[position] + second[position] + third[position];
        alumn__mean = alumn_sum / numb_semester;

        System.out.println("***RESULTS***");
        System.out.println("The mean for the FIRST quarter group is " + meanF);
        System.out.println("The mean for the SECOND quarter group is " + meanS);
        System.out.println("The mean for the THIRD quarter group is " + meanT);
        System.out.println("");
        System.out.println("the student mean is: " + alumn__mean);

    }
}
