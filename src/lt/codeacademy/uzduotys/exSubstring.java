package lt.codeacademy.uzduotys;

public class exSubstring {
    public static void main(String[]args) {
        String vardas = "Mano vardas Vytautas";
        String pirmasVardas = vardas.substring(12);
        String antrasVardas = vardas.substring(0, 4);
        System.out.println(pirmasVardas);
        System.out.println(antrasVardas);

    }
}
