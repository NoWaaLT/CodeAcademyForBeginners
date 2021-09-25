public class ArrayEx6 {
    public static void main(String[] args) {
        int[] numbers = {1000, 1500, 2000, 2500, 3000, 3500, 4000, 4500 ,5000 , 5500, 6000, 6500, 7000, 7500};
        int[] reverseNumbers = new int[numbers.length];
        int length = numbers.length - 1;

        for (int i = 0; i < numbers.length; i++) {
            reverseNumbers[length - i] = numbers[i];

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(reverseNumbers[i]);
        }
    }
}
