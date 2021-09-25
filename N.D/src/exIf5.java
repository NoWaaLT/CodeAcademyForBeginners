import java.sql.SQLOutput;
import java.util.Scanner;
public class exIf5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 1st number : ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter a 2nd number : ");
        int secondNumber = sc.nextInt();
        System.out.println("Enter a 3rd number : ");
        int thirdNumber = sc.nextInt();

        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            System.out.println("The lowest number is : " + firstNumber);
        } else if (secondNumber < firstNumber && secondNumber < thirdNumber) {
                System.out.println("The lowest number is : " + secondNumber);
            }
        else if (thirdNumber < firstNumber && thirdNumber < secondNumber) {
            System.out.println("The lowest number is : " + thirdNumber);
        }
        else {
            System.out.println("Some numbers are the same!");
        }
        sc.close();
    }
}
