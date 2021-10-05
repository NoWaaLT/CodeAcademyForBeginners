import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int pajamuIrasasCounter = 0;
        int islaiduIrasasCounter = 0;
        int iBanka = 0, grynais = 0, islaidosGrynais = 0, islaidosKortele = 0; // pozymis ar i banko saskaita
        boolean onOrOff = true;
        boolean YN; // pozymis y ar n
        String pozymisArIBanka = null;
        String pozymisArIBanka2 = null;
        Biudzetas b1 = new Biudzetas();
        int option2; // pajamu antram switchui
        int option3; // islaidu antram switchui
        int indeksoNr; // user nurodyti iraso indeksui laikyti
        LocalDateTime dateTime = LocalDateTime.now();
        int option;

        System.out.println("Programa - biudzetas!");

        Scanner scn = new Scanner(System.in);

        while (onOrOff) {

            System.out.println("1. Iveskite pajamas \n" +
                    "2. Iveskite islaidas \n" +
                    "3. Ispausdinti pajamu irasus \n" +
                    "4. Ispausdinti islaidu irasus \n" +
                    "5. Balansas\n" +
                    "6. Isjungti programa");

            option = scn.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Iveskite pajamas : ");
                    int suma = scn.nextInt();
                    scn.nextLine();
                    String dataIrLaikas = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
                    System.out.println("Pajamu ivedimo data ir laikas " + dataIrLaikas);
                    String data = dataIrLaikas;
                    System.out.println("Pajamu kategorija : ");
                    String kategorija = scn.nextLine();
                    YN = true;

                    while (YN) {
                        System.out.println("Pozymis ar i banka gauti pinigai? \n" +
                                "TAIP/NE?");
                        pozymisArIBanka = scn.nextLine();
                        if (pozymisArIBanka.equalsIgnoreCase("TAIP")) {
                            iBanka++;
                            YN = false;
                        } else if (pozymisArIBanka.equalsIgnoreCase("NE")) {
                            grynais++;
                            YN = false;
                        } else {
                            System.out.println("Klaida! Iveskite tinkama pasirinkimo raide!");
                        }
                    }
                    System.out.println("Iveskite papildoma informacija : ");
                    String papildomaInfo = scn.nextLine();
                    PajamuIrasas p1 = new PajamuIrasas(suma, data, kategorija, pozymisArIBanka, papildomaInfo);

                    b1.setInfo(p1);
                    pajamuIrasasCounter++;
                    break;

                case 2:
                    System.out.println("Iveskite islaidas : ");
                    int suma2 = scn.nextInt();
                    scn.nextLine();
                    String dataIrLaikas2 = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
                    System.out.println("Islaidu ivedimo data ir laikas " + dataIrLaikas2);
                    String data2 = dataIrLaikas2;
                    System.out.println("Islaidu kategorija : ");
                    String kategorija2 = scn.nextLine();
                    YN = true;

                    while (YN) {
                        System.out.println("Atsiskaitymo budas :? \n" +
                                "GRYNAIS/KORTELE?");
                        pozymisArIBanka2 = scn.nextLine();
                        if (pozymisArIBanka2.equalsIgnoreCase("GRYNAIS")) {
                            islaidosGrynais++;
                            YN = false;
                        } else if (pozymisArIBanka2.equalsIgnoreCase("KORTELE")) {
                            islaidosKortele++;
                            YN = false;
                        } else {
                            System.out.println("Klaida! Iveskite tinkama pasirinkimo zodi!");
                        }
                    }
                    System.out.println("Iveskite papildoma informacija : ");
                    String papildomaInfo2 = scn.nextLine();
                    IslaiduIrasas i1 = new IslaiduIrasas(suma2, data2, kategorija2, pozymisArIBanka2, papildomaInfo2);

                    b1.setInfo(i1);
                    islaiduIrasasCounter++;
                    break;
                case 3:
                    System.out.println("Is viso yra " + pajamuIrasasCounter + " irasu.");
                    System.out.println("1. Spausdinti viena irasa : \n" +
                            "2. Spausdinti visus pajamu irasus");
                    option2 = scn.nextInt();

                    switch (option2) {
                        case 1:
                            System.out.println("Nurodykite indeksa,tarp 0 ir " + (pajamuIrasasCounter - 1) + ", kuri irasa noresite atspausdinti :");
                            indeksoNr = scn.nextInt();
                            b1.getPajamosSingleInfo(indeksoNr);
                            break;
                        case 2:
                            System.out.println("Programa spaudina visus irasus : ");
                            b1.getPajamosInfoAll();
                            break;
                        default:
                            System.out.println("Tokio pasirinkimo nera.");
                    }

                    break;
                case 4:
                    System.out.println("Is viso yra " + islaiduIrasasCounter + " irasu.");
                    System.out.println("1. Spausdinti viena irasa : \n" +
                            "2. Spausdinti visus islaidu irasus");
                    option3 = scn.nextInt();
                    switch (option3) {
                        case 1:
                            System.out.println("Nurodykite indeksa,tarp 0 ir " + (islaiduIrasasCounter - 1) + ", kuri irasa noresite atspausdinti :");
                            indeksoNr = scn.nextInt();
                            b1.getIslaidosSingleInfo(indeksoNr);
                            break;
                        case 2:
                            System.out.println("Programa spaudina visus irasus : ");
                            b1.getIslaidosInfoAll();
                            break;
                        default:
                            System.out.println("Tokio pasirinkimo nera.");
                    }
                    break;

                case 5:
                    boolean YN2 = true;
                    while (YN2) {
                        System.out.println("Nurodykite programai koki balansa spausdinti :\n" +
                                "1. Pajamu balansas\n" +
                                "2. Islaidu balansas");
                        int case5 = scn.nextInt();
                        scn.nextLine();
                        switch (case5) {
                            case 1:
                                System.out.println(b1.TotalPajamuBalansas());
                                YN2 = false;
                                break;
                            case 2:
                                System.out.println(b1.TotalIslaiduBalansas());
                                YN2 = false;
                                break;
                            default:
                                System.out.println("Klaida");
                        }

                    }

                default:
                    if (option == 6) {
                        System.out.println("Programa baigia darba.");
                        onOrOff = false;
                    } else if (option < 1 | option > 6){
                        System.out.println("Tokio meniu pasirinkimo nera");
                        break;
                    }
//
            }

        }

    }
}

