import java.util.Scanner;
public class exIf2 {
    public static void main(String[] args) {
        int first, second, third, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number :");
        first = sc.nextInt();
        System.out.println("Enter 2nd number :");
        second = sc.nextInt();
        System.out.println("Enter 3rd number :");
        third = sc.nextInt();

        sum = first + second + third;

        if (first * first > sum) {
            System.out.println("Kvadratai laimi!");
        }
        else if (second * second > sum) {
            System.out.println("Kvadratai laimi!");
        }
        else if (third * third > sum) {
            System.out.println("Kvadratai laimi!");
        }
        sc.close();

    }
}
