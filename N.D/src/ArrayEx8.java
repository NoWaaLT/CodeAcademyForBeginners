/* Write a Java program to find all pairs
 * of elements in an array whose sum is equal
 * to a specific number.
 * Output : Pairs of elements and their sum :
 * 4 + 11 = 15;
 * -5 + 20 = 15;
 * Pairs of elements and their sum :
 * 14 + 16 = 30
 * -15 + 45 = 30
 *  */

public class ArrayEx8 {
    public static void main(String[] args) {
        int[] numbers = {4, 11, -5, 20, 14, 16, -15, 45};
        int inputNumber = 15;
        int inputNumber2 = 30;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == inputNumber) {
                    System.out.println(numbers[i] + " + " + numbers[j] + " = " + inputNumber);
                }
            }
        }
        System.out.println("----------------------");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == inputNumber2) {
                    System.out.println(numbers[i] + " + " + numbers[j] + " = " + inputNumber2);
                }
            }
        }
    }
}
