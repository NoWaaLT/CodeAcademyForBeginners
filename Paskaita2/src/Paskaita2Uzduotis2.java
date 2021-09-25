public class Paskaita2Uzduotis2 {
    public static void main(String[]args) {
        String pavadinimas = "Sielu valdovas";

        String subs = pavadinimas.substring(3); //naudojame nukirpimo metoda, parametre nurodome iki kurio index apkerpame
        System.out.println(subs);

        char atch = pavadinimas.charAt(4); // nurodo char, parametre nurodome index
        System.out.println(atch);

        String replc = pavadinimas.replace('e', 'g'); // pakeicia simbolius, nurodom sena ir nauja kuriuo keisime
        System.out.println(replc);

        int ind = pavadinimas.indexOf('u'); // parodo koks index, reikia in single quotes nurodyti, jei žodi nurodom, tai parodo pirmo simbolio index
        System.out.println(ind);

        String pavadinimas2 = "Sielu medziotojas";
        boolean arToksPat = pavadinimas.equals(pavadinimas2); // parodo ar vienodi ar ne
        System.out.println(arToksPat);

        int comp = pavadinimas.compareTo(pavadinimas2); // gauna skirtuma pagal unicodo simblių skaičių reiksmes
        System.out.println(comp);

        String pavadinimas3 = " Labas Lietuva! ";
        String trimas = pavadinimas3.trim(); // apkarpo tarpus , pradžioje ir pabaigoje stringe
        System.out.println(trimas);

        String lower = pavadinimas.toLowerCase(); // sumažina tekstą į mažasias
        System.out.println(lower);

        String upper = pavadinimas.toUpperCase(); // padidina teksta i didžiasias
        System.out.println(upper);



    }
}
