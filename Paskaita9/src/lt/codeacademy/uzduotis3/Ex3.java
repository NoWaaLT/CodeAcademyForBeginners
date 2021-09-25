package lt.codeacademy.uzduotis3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        double d1 = m1();
        double d2 = m2();

        System.out.println("Sum is : " + (d1 + d2));
    }

    private static double m2() {
        double d1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a second number : ");
        d1 = sc.nextDouble();
        sc.close();
        return d1;

    }

    private static double m1() {
        return 123.5;
    }
}
