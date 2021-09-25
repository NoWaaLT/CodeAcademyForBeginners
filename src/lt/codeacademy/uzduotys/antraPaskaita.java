package lt.codeacademy.uzduotys;

public class antraPaskaita {
    public static void main(String[]args) {
        int pirmas = 4;
        int antras = 15;
        float rez;
        pirmas++;
        antras--;

        rez = pirmas * antras / 5;
        double tikslus = (double) rez; // Cia mes sukuriame nauja kintamaji double tikslumui, ir pasisaviname rez reiksme pakeisdami primitive type.
        System.out.println(tikslus);

    }
}
