/*Write a Java program that reads a floating-point number
and prints "zero” if the number is zero.
Otherwise, print "positive" or "negative".
Add "small" if the absolute value of the number
is less than 1, or "large" if it exceeds 1,000,000.

 */


import java.util.Scanner;

public class log3 {
    public static void main(String[] args) {
        int small = 1, large = 1000000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double num = sc.nextDouble();
        if (num == 0) {
            System.out.println("Zero");
        } else if (num > 0 && num <= small) {
            System.out.println("It's small positive number");
        } else if (num > large) {
            System.out.println("It's large positive number");
        } else if (num > small && num < large) {
            System.out.println("It's positive number");
        }
    }
}
