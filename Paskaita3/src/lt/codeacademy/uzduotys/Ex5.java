package lt.codeacademy.uzduotys;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Įveskite pirmajį skaičių :");
        float sk1 = scan1.nextFloat();
        System.out.println("Įveskite antrajį skaičių :");
        float sk2 = scan1.nextFloat();
        scan1.close();
        float ats1 = (sk1 + sk2) / 2;

        System.out.println("Duotų skaičių aritmetinis vidurkis : " + ats1);
    }
}
