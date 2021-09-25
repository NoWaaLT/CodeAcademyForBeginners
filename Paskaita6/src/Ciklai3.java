import java.util.Scanner;

public class Ciklai3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {

            int[]numbers = new int[10];
            numbers[i] = sc.nextInt();
            System.out.println(numbers[i]);
        }
        System.out.println("Program finished");
    }
}
