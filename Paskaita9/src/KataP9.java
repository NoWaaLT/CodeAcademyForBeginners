import java.util.Random;
import java.util.Scanner;

public class KataP9 {
    public static void main(String[] args) {
        int correctTry = 0;
        int min = 10;
        int max = 15;
        int num = 0; // inputed number by user
        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(max - min + 1) + min; // generating random numbers in range, importing a Random class.
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int[] numbers2 = new int[5];

        for (int i = 0; i < numbers2.length; ) {
            System.out.println("Enter a number to an array between 10 and 15 : ");

            num = scn.nextInt();
            if (num >= 10 && num <= 15) {
                numbers2[i] = num;
                i++;
            } else {
                System.out.println("Invalid number! Enter a number between 10 and 15 : ");
            }

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }

        boolean[] equalsOrNot = new boolean[5];
        for (int i = 0; i < equalsOrNot.length; i++) {
            equalsOrNot[i] = numbers[i] == numbers2[i];
            System.out.println(equalsOrNot[i]);

        }
    }

}
        





