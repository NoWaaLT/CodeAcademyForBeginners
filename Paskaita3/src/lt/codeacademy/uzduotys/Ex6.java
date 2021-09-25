package lt.codeacademy.uzduotys;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Įveskite pirmajį skaičių :");
        int a = scan2.nextInt();
        System.out.println("Įveskite antrajį skaičių :");
        int b = scan2.nextInt();
        scan2.close();
        System.out.println("a yra : " + a);
        System.out.println("b yra : " + b);


        System.out.println("Sukeičiam vietomis..");

        int c = a;
        a = b;
        b = c;

        System.out.println("a yra : " + a);
        System.out.println("b yra : " + b);
    }
}
