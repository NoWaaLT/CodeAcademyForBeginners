package lt.codeacademy.uzduotys;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan4 = new Scanner(System.in);

        System.out.println("Įveskite tekstą :");
        String text = scan4.next();

        int ilg = (text.length() / 2) - 1;

        System.out.println("simbolis viduryje : " + text.charAt(ilg));


    }
}
