import java.util.Scanner;

public class exIf7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number : ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter a second number : ");
        int secondNumber = sc.nextInt();
        System.out.println("Enter a third number : ");
        int thirdNumber = sc.nextInt();
        System.out.println("Enter a forth number : ");
        int forthNumber = sc.nextInt();

        if (thirdNumber % 5 == 0) {
            System.out.println(firstNumber*firstNumber*firstNumber);
            System.out.println(secondNumber*secondNumber*secondNumber);
            System.out.println(thirdNumber*thirdNumber*thirdNumber);
            System.out.println(forthNumber*forthNumber*forthNumber);
        }
        sc.close();
    }
}
