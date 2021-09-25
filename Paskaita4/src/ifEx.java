import java.util.Scanner;

public class ifEx {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Prašome įvesti mėnesio skaičių :");
        int menuo = scn.nextInt();
        String menPav; // sukuriam String kintamaji, kad talpintume menPav
        if (menuo <= 0 || menuo >= 13) { // jeigu daugiau arba maziau, blogai
            System.out.println("Netinkamas mėnuo");
        } else if (0 < menuo && menuo < 13) { // jeigu tarp 0 ir 13

                String lygNe = menuo % 2 == 0 ? "Menuo yra lyginis" : "Menuo yra nelyginis"; // čia if else sąlyga sutrumpintai.
                System.out.println(lygNe);

            }
            switch (menuo) { // Suteikiam kintamajam int reiksme String
                case 1:
                    menPav = "Sausis".toLowerCase();
                    break;
                case 2:
                    menPav = "Vasaris".toUpperCase();;
                    break;
                case 3:
                    menPav = "Kovas".toLowerCase();
                    break;
                case 4:
                    menPav = "Balandis".toUpperCase();
                    break;
                case 5:
                    menPav = "Gegužė".toLowerCase();
                    break;
                case 6:
                    menPav = "Biržels".toUpperCase();;
                    break;
                case 7:
                    menPav = "Liepa".toLowerCase();
                    break;
                case 8:
                    menPav = "Rugpjūtis".toUpperCase();;
                    break;
                case 9:
                    menPav = "Rugsėjis".toLowerCase();
                    break;
                case 10:
                    menPav = "Spalis".toUpperCase();;
                    break;
                case 11:
                    menPav = "Lapkritis".toLowerCase();
                    break;
                case 12:
                    menPav = "Gruodis".toUpperCase();;
                    break;
                default : menPav = "Klaida";
                    break;


            }
            System.out.println(menPav);
        }


    }

