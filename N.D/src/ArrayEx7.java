/* Write a Java program to find the duplicate
 * values of an array of integer values.
 * */

public class ArrayEx7 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 5, 5, 6, 6, 7, 2};
        int dup = 0;
        int dupStart = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    // System.out.println("Duplicate number is : " + numbers[j]); // As well you can show duplicates numbers without storing them by this code inserted to a if condition
                    dup++;
                }

            }
        }
        System.out.println("Duplicates in total : " + dup);
        int[] duplicates = new int[dup];

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) { // Imagine logic and you will see, how duplicates check in an array works.
                if (numbers[i] == numbers[j]) {
                    duplicates[dupStart] = numbers[j];
                    dupStart++;
                }

            }
        }
        for (int i = 0; i < duplicates.length; i++) {
            System.out.println("The duplicate number is : " + duplicates[i]);
        }


    }
}
