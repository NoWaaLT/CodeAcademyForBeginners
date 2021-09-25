import java.util.Scanner;

public class Kata1 {
    public static void main(String[] args) {
        int pirm, antr, trec;
        Scanner scn = new Scanner(System.in);
        System.out.println("Iveskitie pirmaji skaiciu :");
        pirm = scn.nextInt();
        System.out.println("Iveskitie antraji skaiciu :");
        antr = scn.nextInt();
        System.out.println("Iveskitie treciaji skaiciu :");
        trec = scn.nextInt();

        scn.close(); // uzdarom scanner.

        System.out.println("Pirmas skaicius : " + pirm);
        System.out.println("Pirmas skaicius : " + antr);
        System.out.println("Pirmas skaicius : " + trec);

        if (pirm > antr && pirm > trec) {
            System.out.println("Didziausias skaicius yra : " + pirm);
        } else if (antr > pirm && antr > trec) {
            System.out.println("Didziausias skaicius yra : " + antr);
        } else if (trec > pirm && trec > antr) {
            System.out.println("Didziausias skaicius yra : " + trec);
        } else {
            System.out.println("Vienas ar keli skaiciai yra vienodi");
        }

        System.out.println("Įvestu skaiciu vidurkis yra : " + (pirm + antr + trec) / 3);

        System.out.println("Visu triju skaiciu kvadratu suma: " + ((pirm * pirm) + (antr * antr) + (trec * trec))); // 100 + 400  + 900

    }
}
