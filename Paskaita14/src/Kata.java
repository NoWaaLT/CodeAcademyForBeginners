import java.util.ArrayList;
import java.util.Scanner;

public class Kata {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] intArray = new int[10];
        int failedCounter = 0;
        int correctNumber = 0;
        int temp; // for temporary
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;

        while (correctNumber < 10) {
            System.out.println("Enter a number in a range from 1 to 5.");
            temp = scn.nextInt();

            if (temp < 1 || temp > 5) {
                System.out.println("You entered invalid number. Please enter number in a range");
                failedCounter++;
            } else {
                intArray[correctNumber] = temp;
                correctNumber++;
            }
        }
        System.out.println("All your entered number : ");

        ArrayList<Integer> intList = new ArrayList<>();
        for (int text : intArray) {
            intList.add(text);
        }

        for (int sk : intList) {
            System.out.print(sk + ", ");
        }


            for (int i = 1; i <= 5; i++) {
                if (intList.contains(i) && i == 1) {
                    counter1++;
                }

        }


    }
}
