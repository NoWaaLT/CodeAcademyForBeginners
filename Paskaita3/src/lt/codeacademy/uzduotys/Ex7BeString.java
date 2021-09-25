package lt.codeacademy.uzduotys;

import java.util.Scanner;

public class Ex7BeString {
    public static void main(String[] args) {
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Įveskite keturženklį skaičių : ");
        int skaicius = scan3.nextInt();
        scan3.close();

        int a = skaicius / 1000;
        int b = (skaicius / 100) % 10;
        int c = (skaicius / 10) % 10;
        int d = skaicius % 10;

        System.out.println("Pirmas skaitmuo : " + a);
        System.out.println("Antras skaitmuo : " + b);
        System.out.println("Trecias skaitmuo : " + c);
        System.out.println("Ketvirtas skaitmuo : " + d);

    }
}
