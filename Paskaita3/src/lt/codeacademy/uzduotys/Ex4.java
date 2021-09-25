package lt.codeacademy.uzduotys;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Įveskite pirmajį skaičių :");
        int sk1 = scan.nextInt();
        System.out.println("Įveskite antrajį skaičių :");
        int sk2 = scan.nextInt();
        scan.close();

        int ats = sk1 + sk2;

        System.out.println("Atsakymas : " + ats);

    }
}
