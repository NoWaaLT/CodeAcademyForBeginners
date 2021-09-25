package lt.codeacademy.uzduotys;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Įveskite skaičių:");
        int ivedimas = scn.nextInt();
        System.out.println("Jūs įvedėte skaičių - " + ivedimas);

        scn.close();
    }
}
