import java.sql.SQLOutput;
import java.util.Scanner;

public class log2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 1st number : ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter a 2nd number : ");
        int secondNumber = sc.nextInt();
        System.out.println("Enter a 3rd number : ");
        int thirdNumber = sc.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("The greatest number is : " + firstNumber);
        }
        else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("The greatest number is : " + secondNumber);
        }
        else {
            System.out.println("The greatest number is : " + thirdNumber);
        }
    }
}
