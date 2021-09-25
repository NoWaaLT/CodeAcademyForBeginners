import java.util.Random;

public class ArrayTry {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            num[i] = rnd.nextInt(10);
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }


    }
}
