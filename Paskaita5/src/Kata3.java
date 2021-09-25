import java.util.Random;
import java.util.Scanner;

public class Kata3 {
    public static void main(String[] args) {
        int pRand, aRand, rndm;
        Scanner scn = new Scanner(System.in);
        System.out.println("Iveskite pirmajį range skačių :");
        pRand = scn.nextInt();
        System.out.println("Iveskite antrajį range skačių :");
        aRand = scn.nextInt();

        Random rnd = new Random();
        rndm = rnd.nextInt(aRand - pRand) + pRand;

        System.out.println("Sugeneruotas skaicius intervale : " + rndm);


    }
}
