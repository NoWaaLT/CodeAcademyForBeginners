import java.sql.SQLOutput;

public class Paskaita2Uzduotis3 {
    public static void main(String[] args) {
        String pav = "Namas";

        String pav2 = pav.replace('s', 'i');
        System.out.println(pav2);

        String pav3 = pav2.toUpperCase();
        System.out.println(pav3);

        String pav4 = pav3.substring(2, 4);
        System.out.println(pav4);

        String pav5low = pav4.toLowerCase();
        String pav5 = pav4 + pav5low;
        System.out.println(pav5);

        String x = pav4 + pav4.toLowerCase(); // galima ir taip
        System.out.println(x);

        String pav6 = pav5.replace('m', 'n');
        System.out.println(pav6);

     /*  String pav7 = pav6.replaceAll(pav6, "2");
       System.out.println(pav7); */

        int pav8 = pav4.length();
        String pav88 = "" + pav8;
        System.out.println(pav8);


    }
}
