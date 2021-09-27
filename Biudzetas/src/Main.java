import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int option;
        int counter = 0;
        int maxCounter = 200;

        System.out.println("Programa - biudzetas!");
        Scanner scn = new Scanner(System.in);

        while (counter <= 200) {
            System.out.println("Pasirinkite, ka noresite ivesti : " + '\n' +
                    "Jeigu pajamas, spauskite 1, jeigu islaidas, spauskite 2.");

            option = scn.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Iveskite pajamas : ");
                    PajamuIrasas pjm = new PajamuIrasas(scn.nextInt());
                    int temp = pjm.getSuma();

                    counter++;

                    break;
                case 2:
                    System.out.println("Iveskite islaidas :");
                    counter++;
                    break;

                default:
                    System.out.println("Tokios ivesties tarp pasirinkimo nera. Rinkites 1 arba 2");
                    System.out.println("--------------------------------");
                    break;
            }
        }

    }
}
