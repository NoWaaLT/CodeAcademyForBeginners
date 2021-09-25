/* Write a Java program to
 * Add (+) two matrices of the same size.
 *  */

import java.util.Scanner;
import java.util.Random;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Enter a number of rows of first and second matric : ");
        int row = sc.nextInt();
        System.out.println("Enter a number of columns of first and second matric : ");
        int column = sc.nextInt();
        int[][] firstMatric = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                firstMatric[i][j] = rnd.nextInt(10);
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(firstMatric[i][j] + "\t");
            }
        }
        System.out.println();

        int[][] secondMatric = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                secondMatric[i][j] = rnd.nextInt(10);
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(secondMatric[i][j] + "\t");
            }


        }

        System.out.println();

        int sumMatric[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sumMatric[i][j] = firstMatric[i][j] + secondMatric[i][j];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(sumMatric[i][j] + "\t");

            }

        }

    }
}
