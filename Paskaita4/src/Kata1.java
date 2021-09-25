import java.sql.SQLOutput;
import java.util.Scanner;

public class Kata1 {
    public static void main(String[] args) {
        int sk1 = 3, sk2 = 4, sk3 = 1, sk4 = 5, sk5 = 2;
        Scanner scn = new Scanner(System.in);
        int skaicius = scn.nextInt();
        if (skaicius == 0) {
            System.out.println("Įveskite kitą skaičių!"); // jei sodirba vsio, jei rašysime if viduje, tai {} kitas ifas tinka
        } else if (skaicius % 2 == 0) { // jeigu nesudirbo pirmas if
            sk1 = 0;
            sk2 = 0;
            sk3 = 0;
            sk4 = 0;
            sk5 = 0;
            System.out.println(sk1);
            System.out.println(sk2);
            System.out.println(sk3);
            System.out.println(sk4);
            System.out.println(sk5);

        } else { // visą kitą.
            int sk6;
            sk6 = sk1; // 3
            sk1 = sk3;
            sk3 = sk6; // 3

            sk6 = sk5; // 2
            sk5 = sk4; // 5
            sk4 = sk2; // 4
            sk2 = sk6; // 2
            System.out.println(sk1);
            System.out.println(sk2);
            System.out.println(sk3);
            System.out.println(sk4);
            System.out.println(sk5);

        }
    }
}
