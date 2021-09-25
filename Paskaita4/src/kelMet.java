import java.util.Scanner;
public class kelMet {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int metai = scn.nextInt();

        if (metai % 4 != 0) {
            System.out.println("Metai yra paprasti");
        }
        else if (metai % 100 != 0) {
            System.out.println("Metai yra keliamieji");
        }
        else if (metai % 400 != 0) {
            System.out.println("Metai yra paprasti");
        }
        else {
            System.out.println("Metai yra keliamieji");
        }

    }
}
