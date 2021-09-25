public class ArrayEx5 {
    public static void main(String[] args) {
        int max, min;
        int[] numbers = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        max = numbers[0];
        min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
            else if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("The largest number is : " + max);
        System.out.println("The smallest number is : " + min);
    }
}
