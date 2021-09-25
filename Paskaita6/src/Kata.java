import java.util.Scanner;
import java.util.Random;

public class Kata {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if (i > 10) {
            System.out.println("Skaicius neteisingas");
            Random rnd = new Random();
            int a = rnd.nextInt(5) + 5;
        } else if (i < 5) {
            System.out.println("Skaicius neteisingas");
            Random rnd = new Random();
            int b = rnd.nextInt(5) + 5;
        }

        int Masyvas[] = new int[i];

        int pirmas = sc.nextInt();
        int antras = sc.nextInt();
        int trecias = sc.nextInt();
        Masyvas[0] = pirmas;
        Masyvas[1] = antras;
        Masyvas[2] = trecias;
    }
}
