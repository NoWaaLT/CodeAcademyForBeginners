import java.util.Scanner;

public class exIf6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number : ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter a second number : ");
        int secondNumber = sc.nextInt();
        System.out.println("Enter a third number : ");
        int thirdNumber = sc.nextInt();

        if (thirdNumber % 2 == 0) {
            int newNumber = firstNumber * secondNumber * thirdNumber;
            System.out.println(newNumber);
        }
        sc.close();
    }

}
