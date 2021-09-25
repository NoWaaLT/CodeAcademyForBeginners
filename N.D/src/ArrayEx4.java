public class ArrayEx4 {
    public static void main(String[] args) {
        int[] numbers = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int length = numbers.length;
        int[] numbersOther = new int[length];
        for (int i = 0; i < length; i++) {
            numbersOther[i] = numbers[i];

        }
        for (int i = 0; i < length; i++) {
            System.out.println(numbersOther[i]);
        }
    }
}

