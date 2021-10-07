import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws InputMismatchException {

//        int iBanka = 0, grynais = 0, islaidosGrynais = 0, islaidosKortele = 0; // pozymis ar i banko saskaita
        boolean onOrOff = true;
        boolean YN; // pozymis y ar n
        String pozymisArIBanka = null;
        String pozymisArIBanka2 = null;
        Biudzetas b1 = new Biudzetas();
        int option2; // pajamu antram switchui
        int option3; // islaidu antram switchui
        int indeksoNr; // user nurodyti iraso indeksui laikyti
        LocalDateTime dateTime = LocalDateTime.now();
        Random rnd = new Random();
        int option;
        System.out.println("Programa - biudzetas!");

        while (onOrOff) {
            System.out.println("1. Iveskite pajamas \n" +
                    "2. Iveskite islaidas \n" +
                    "3. Spausdinti pajamu irasus \n" +
                    "4. Spausdinti islaidu irasus \n" +
                    "5. Balansas\n" +
                    "6. Isjungti programa");

            option = IntegerCheckas();
            switch (option) {
                case 1:
                    System.out.println("Iveskite pajamas : ");
                    int suma = IntegerCheckas();
                    scn.nextLine();
                    String dataIrLaikas = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
                    System.out.println("Pajamu ivedimo data ir laikas " + dataIrLaikas);
                    String data = dataIrLaikas;
                    System.out.println("Pajamu kategorija : ");
                    String kategorija = scn.nextLine();
                    YN = true;

                    while (YN) {
                        System.out.println("GRYNAIS/PAVEDIMAS?: ");
                        pozymisArIBanka = scn.nextLine();
                        if (pozymisArIBanka.equalsIgnoreCase("PAVEDIMAS")) {
//                            iBanka++;
                            YN = false;
                        } else if (pozymisArIBanka.equalsIgnoreCase("GRYNAIS")) {
//                            grynais++;
                            YN = false;
                        } else {
                            System.out.println("Klaida! Iveskite tinkama pasirinkimo raide!");
                        }
                    }
                    System.out.println("Iveskite papildoma informacija : ");
                    String papildomaInfo = scn.next();
                    int id = rnd.nextInt(999999);
                    scn.nextLine();
                    PajamuIrasas p1 = new PajamuIrasas(suma, data, kategorija, pozymisArIBanka, papildomaInfo, id);

                    b1.pajamuSarasas.add(p1);
                    break;

                case 2:
                    System.out.println("Iveskite islaidas : ");
                    int suma2 = IntegerCheckas();
                    scn.nextLine();
                    String dataIrLaikas2 = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
                    System.out.println("Islaidu ivedimo data ir laikas " + dataIrLaikas2);
                    String data2 = dataIrLaikas2;
                    System.out.println("Islaidu kategorija : ");
                    String kategorija2 = scn.nextLine();
                    YN = true;

                    while (YN) {
                        System.out.println("Atsiskaitymo budas :? \n" +
                                "GRYNAIS/PAVEDIMAS?");
                        pozymisArIBanka2 = scn.nextLine();
                        if (pozymisArIBanka2.equalsIgnoreCase("GRYNAIS")) {
//                            islaidosGrynais++;
                            YN = false;
                        } else if (pozymisArIBanka2.equalsIgnoreCase("PAVEDIMAS")) {
//                            islaidosKortele++;
                            YN = false;
                        } else {
                            System.out.println("Klaida! Tokios pasirinkties nera");
                        }
                    }
                    System.out.println("Iveskite papildoma informacija : ");
                    String papildomaInfo2 = scn.next();
                    int id2 = rnd.nextInt(999999);
                    scn.nextLine();
                    IslaiduIrasas i1 = new IslaiduIrasas(suma2, data2, kategorija2, pozymisArIBanka2, papildomaInfo2, id2);

                    b1.islaiduSarasas.add(i1);
                    break;
                case 3:
                    System.out.println("Is viso yra " + b1.counter + " irasu.");

                    System.out.println("1. Spausdinti viena irasa : \n" +
                            "2. Spausdinti visus pajamu irasus");
                    option2 = IntegerCheckas();

                    switch (option2) {
                        case 1:
                            System.out.println("Nurodykite indeksa,tarp 0 ir " + (b1.counter - 1) + ", kuri irasa noresite atspausdinti :");
                            indeksoNr = IntegerCheckas();
                            System.out.println(b1.toStringPajamos(indeksoNr));
                            break;
                        case 2:
                            System.out.println("Programa spausdina visus irasus : ");
                            b1.PajamosInfoAll();
                            System.out.println("1. Naikinti irasa\n" + "2. Grizti");
                            option2 = IntegerCheckas();
                            switch (option2) {
                                case 1:
                                    System.out.println("Nurodykite indekso nr, kuri norite istrinti : ");
                                    b1.pajamuSarasas.remove(IntegerCheckas());
                                    break;
                                default:
                                    System.out.println("Tokio pasirinkimo nera.");
                            }
                    }

                    break;
                case 4:
                    System.out.println("Is viso yra " + b1.counter2 + " irasu.");
                    System.out.println("1. Spausdinti viena irasa : \n" +
                            "2. Spausdinti visus islaidu irasus");
                    option3 = IntegerCheckas();
                    switch (option3) {
                        case 1:
                            System.out.println("Nurodykite indeksa,tarp 0 ir " + (b1.counter2 - 1) + ", kuri irasa noresite atspausdinti :");
                            indeksoNr = IntegerCheckas();
                            System.out.println(b1.toStringIslaidos(indeksoNr));
                            break;
                        case 2:
                            System.out.println("Programa spaudina visus irasus : ");
                            b1.IslaidosInfoAll();
                            System.out.println("1. Naikinti irasa\n" + "2. Grizti");
                            option3 = IntegerCheckas();
                            switch (option3) {
                                case 1:
                                    System.out.println("Nurodykite indekso nr, kuri norite istrinti : ");
                                    b1.islaiduSarasas.remove(IntegerCheckas());
                                    break;
                                default:
                                    System.out.println("Tokio pasirinkimo nera.");
                            }
                            break;
                        default:
                            System.out.println("Tokio pasirinkimo nera.");
                    }
                    break;

                case 5:
                    boolean YN2 = true;
                    while (YN2) {
                        System.out.println("Pasirinkite funkcija :\n" +
                                "1. Balansas\n" +
                                "2. Is viso pajamu\n" +
                                "3. Is viso islaidu");
                        int case5 = IntegerCheckas();
                        scn.nextLine();
                        switch (case5) {
                            case 1:
                                System.out.println(b1.Balansas());
                                YN2 = false;
                                break;
                            case 2:
                                System.out.println(b1.TotalPajamos());
                                YN2 = false;
                                break;
                            case 3:
                                System.out.println(b1.TotalIslaidos());
                                YN2 = false;
                                break;
                            default:
                                System.out.println("Klaida! Nurodykite tinkama pasirinkima");
                        }

                    }

                default:
                    if (option == 6) {
                        System.out.println("Programa baigia darba.");
                        onOrOff = false;

                    } else if (option < 1 | option > 6) {
                        System.out.println("Tokio meniu pasirinkimo nera");
                        break;
                    }
//
            }

        }

    }

    public static int IntegerCheckas() {
        while (true) {
            try {
                return scn.nextInt();
            } catch (InputMismatchException e) {
                scn.next();
                System.out.println("Ivesciai naudokite skaicius");
            }
        }
    }

}


