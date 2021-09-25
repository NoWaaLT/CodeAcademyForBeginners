import java.util.Arrays;

public class ArrayEx6b {
    public static void main(String[] args) {
        int[]numbers = {10,20,30,40,50,60,70,80,90,100};

        System.out.println(Arrays.toString(numbers)); // import Arrays class and printing values of array with toString() method

        for (int i = 0; i < numbers.length/2; i++) {
            int temp = numbers[i]; // variable temp stores a value, because he is changed. We need it to store to last array index
            numbers[i] = numbers[numbers.length-1-i];
            numbers[numbers.length-1-i] = temp; // storing last array

        }
        System.out.println("-------------------");
        System.out.println(Arrays.toString(numbers));
    }
}
