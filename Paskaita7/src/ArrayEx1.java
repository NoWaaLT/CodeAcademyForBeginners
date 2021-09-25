/* 1. Write a Java program that sum a values of Array */
/* 2. Calculate a avarage value of array values */
public class ArrayEx1 {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 8, 7, 8};
        int sum = 0;
        double arrayLength = numbers.length;

       for (int i = 0; i < arrayLength; i++) {
            sum += numbers[i];

        }

       /* for (int i : numbers)
            sum += i; */

        System.out.println("The sum of array values is : " + sum);


        double avg = sum / arrayLength;

        System.out.println("Average of array values is : " + avg);

    }
}
