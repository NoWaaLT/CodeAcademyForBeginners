import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int option;
        int pajamuIrasasCounter = 0;
        int iBanka = 0; // pozymis ar i banko saskaita
        int grynais = 0;
        boolean onOrOff = true;
        boolean YN = true; // pozymis y ar n
        String pozymisArIBanka = null;
        Biudzetas b1 = new Biudzetas();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Programa - biudzetas!");

        Scanner scn = new Scanner(System.in);

        while (onOrOff == true) {

            System.out.println("1. Iveskite pajamas \n"
                    + "2. Iveskite islaidas \n" +
                    "3. Ispausdinti pajamu irasa \n" +
                    "5. Isjungti programa");

            option = scn.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Iveskite pajamas : ");
                    String suma = scn.next();
                    String dataIrLaikas = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
                    System.out.println("Pajamu ivedimo data ir laikas " + dataIrLaikas);
                    String data = dataIrLaikas;
                    System.out.println("Pajamu kategorija : ");
                    String kategorija = scn.next();
                    YN = true;

                    while (YN == true) {
                        System.out.println("Pozymis ar i banka gauti pinigai? \n" +
                                "Y/N?");
                        pozymisArIBanka = scn.next();
                        if (pozymisArIBanka.equalsIgnoreCase("Y")) {
                            iBanka++;
                            YN = false;
                        } else if (pozymisArIBanka.equalsIgnoreCase("N")) {
                            grynais++;
                            YN = false;
                        } else {
                            System.out.println("Klaida! Iveskite tinkama pasirinkimo raide!");
                        }
                    }
                    System.out.println("Iveskite papildoma informacija : ");
                    String papildomaInfo = scn.next();
                    PajamuIrasas p1 = new PajamuIrasas(suma, data, kategorija, pozymisArIBanka, papildomaInfo);

                    b1.setInfo(p1);
                    pajamuIrasasCounter++;
                    break;

                case 2:
                    System.out.println("Iveskite islaid1as :");
                    break;
                case 3:
                    System.out.println("Is viso yra " + pajamuIrasasCounter + " irasu.");
                    System.out.println("Nurodykite indeksa,tarp 0 ir " + (pajamuIrasasCounter - 1) + ", kuri irasa noresite atspausdinti :");
                    b1.getInfoAll();
                    break;
                case 5:
                    onOrOff = false;
                default:
                    if (option != 1 | option != 2 | option != 3 | option != 4 | option != 5) {
                        System.out.println("Klaida! Tokios pasirinkties nera");
                    }

                    System.out.println("--------------------------------");
                    break;
            }
        }

    }
}
