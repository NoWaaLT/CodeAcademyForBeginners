import java.util.Random;

public class randomEx {
    public static void main(String[] args) {
        Random rnd = new Random();
        int pirmas, antras, trecias;

        pirmas = rnd.nextInt(100) + 1;
        antras = rnd.nextInt(100) + 1;
        trecias = rnd.nextInt(100) + 1;

        System.out.println("Reiksme pirmo sk : " + pirmas);
        System.out.println("Reiksme antro sk : " + antras);
        System.out.println("Reiksme trecio sk : " + trecias);

        int did = Math.max(pirmas, antras);
        did = Math.max(did, trecias);
        System.out.println("Didziausia reiksme : " + did);
    }
}
