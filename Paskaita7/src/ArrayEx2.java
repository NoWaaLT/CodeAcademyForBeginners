public class ArrayEx2 {
    public static void main(String[] args) {
        int[]numbers = {1, 2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};
        int index = 1;

        for (int i = index; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }



    }
}


