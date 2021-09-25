import java.util.Random;
import java.util.Scanner;

public class Kata2 {
    public static void main(String[] args) {
        int pirm, antr;
        Random rnd = new Random();
        pirm = rnd.nextInt(15000);
        Scanner scn = new Scanner(System.in);
        System.out.println("Iveskite skaiciu : ");
        antr = scn.nextInt();

        System.out.println("Sugeneruotas skaicius : " + pirm); // random
        System.out.println("Ivestas skaicius : " + antr); // ivestas

        if (pirm > antr) {
            System.out.println("Sugeneruotas skaicius uz ivesta skaiciu yra didesnis : " + (pirm - antr));
        } else if (antr > pirm) {
            System.out.println("Ivestas skaicius uz sugeneruota skaiciu yra didesnis : " + (antr - pirm));
        } else {
            System.out.println("Abu skaiciai yra lygus!");
        }


    }
}
