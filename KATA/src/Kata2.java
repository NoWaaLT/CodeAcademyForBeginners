
import java.util.Random;

public class Kata2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] numbers = new int[rnd.nextInt(15)];
        int max;
        int max2;
        int min;
        int temp;


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(15);
        }
        max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("-------------------");

        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = i + 1; j < numbers.length; j++)
            {
                if (numbers[i] > numbers[j])
                {
                    max = numbers[i];
                }
                else if (numbers[i] < numbers[j] && max > numbers[i]) {
                    max2 = numbers[i];
                }
            }
        }
        System.out.println(max);
        System.out.println(max2);

        /* for (int i = 0; i < numbers.length; i++)
        {
            for (int j = i + 1; j < numbers.length; j++)
            {
                if (numbers[i] < numbers[j])
                {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        } */


    }
}