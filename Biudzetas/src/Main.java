import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        String option; // main programos meniu
        int pajamuIrasasCounter = 0;
        int islaiduIrasasCounter = 0;
        int iBanka = 0; // pozymis ar i banko saskaita
        int grynais = 0;
        int islaidosGrynais = 0;
        int islaidosKortele = 0;
        boolean onOrOff = true;
        boolean YN; // pozymis y ar n
        String pozymisArIBanka = null;
        String pozymisArIBanka2 = null;
        Biudzetas b1 = new Biudzetas();
        int option2; // pajamu antram switchui
        int option3; // islaidu antram switchui
        int indeksoNr; // user nurodyti iraso indeksui laikyti
        LocalDateTime dateTime = LocalDateTime.now();
        String option;

        System.out.println("Programa - biudzetas!");

        Scanner scn = new Scanner(System.in);

        while (onOrOff) {

            System.out.println("1. Iveskite pajamas \n" +
                    "2. Iveskite islaidas \n" +
                    "3. Ispausdinti pajamu irasus \n" +
                    "4. Ispausdinti islaidu irasus \n" +
                    "5. Isjungti programa");

            option = scn.next();

            switch (option) {
                case "1":
                    scn.nextLine();
                    System.out.println("Iveskite pajamas : ");
                    String suma = scn.nextLine();
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

                case "2":
                    System.out.println("Iveskite islaidas : ");
                    String suma2 = scn.nextLine();
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
                case "3":
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
                case "4":
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

                case "5":
                    onOrOff = false;
                default:
                    if (option.equals("5")) {
                        System.out.println("Programa baigia darba.");
                        break;
                    }
//                    else {
//                        System.out.println("Klaida! Tokio pasirinkimo nera.");
//                        continue;
//                    }
            }
        }

    }

}

