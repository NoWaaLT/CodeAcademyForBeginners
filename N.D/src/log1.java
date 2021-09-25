import java.util.Scanner;
public class log1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        if (number > 0 ) {
            System.out.println("The number is positive");
        }
        else if (number == 0) {
            System.out.println("The number is neutral!");
        }
        else {
            System.out.println("The number is negative!");
        }
        sc.close();
    }
}
