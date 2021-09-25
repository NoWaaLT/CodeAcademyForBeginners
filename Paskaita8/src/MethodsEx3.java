import java.util.Scanner;

public class MethodsEx3 {
    public static void main(String[] args) {
        double d1 = m1();
        double d2 = m2();


        System.out.println(d1 + " + " + d2 + " yra lygu = " + (d2 + d1));

    }


    private static double m1() {

        return 123.5;
    }

    private static double m2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a double :");
        double d2 = sc.nextDouble();
        return d2;
    }
}

