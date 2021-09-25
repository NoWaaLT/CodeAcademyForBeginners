import java.util.Random;
import java.util.Scanner;

public class Kata4 {
    public static void main(String[] args) {
        int pirmK, antrK, spejimas, sumK;
        Random rnd = new Random();
        pirmK = rnd.nextInt(6) + 1;
        System.out.println("Išridentas pirmasis kauliukas!");
        System.out.println("..............................");
        antrK = rnd.nextInt(6) + 1;
        System.out.println("Išridentas antrasis kauliukas!");
        System.out.println("..............................");

        System.out.println("Iveskite spejamųjų kauliukų sumą : ");
        Scanner scn = new Scanner(System.in);
        spejimas = scn.nextInt();
        System.out.println("Jūsų spėjimas yra : " + spejimas);
        System.out.println("Pirmojo išridento kauliuko skaičius yra : " + pirmK);
        System.out.println("Antrojo išridento kauliuko skaičius yra : " + antrK);
        sumK = pirmK + antrK;
        System.out.println("Išridentų kauliukų suma : " + sumK);
        if (sumK < spejimas) {
            System.out.println("Reikėjo spėti ant " + (spejimas - sumK) + " mažesnį skaičių.");
        } else if (sumK > spejimas) {
            System.out.println("Reikėjo spėti ant " + (sumK - spejimas) + " didesnį skaičių.");
        } else {
            System.out.println("Valio! Atspėjote.");
        }


    }
}
