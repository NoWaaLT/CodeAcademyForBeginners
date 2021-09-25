import java.util.Random;

public class RandomEx2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int pirmas, antras, trecias;

        pirmas = rnd.nextInt(100) + 1;
        antras = rnd.nextInt(100) + 1;
        trecias = rnd.nextInt(100) + 1;

        System.out.println("Reiksme pirmo sk : " + pirmas);
        System.out.println("Reiksme antro sk : " + antras);
        System.out.println("Reiksme trecio sk : " + trecias);

        if (pirmas > antras && pirmas > trecias ) {
            System.out.println("Didziausia reiksme : " + pirmas);
        }
        else if (antras > pirmas && antras > trecias) {
            System.out.println("Didziausia reiksme : " + antras);
        }
        else if (trecias > pirmas && trecias > antras) {
            System.out.println("Didziausia reiksme " + trecias);
        }
        else {
            System.out.println("Skaiciai yra vienodi");
        }
    }
}