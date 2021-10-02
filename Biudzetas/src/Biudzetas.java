import java.util.Arrays;

public class Biudzetas {

    PajamuIrasas[] pajamos = new PajamuIrasas[100];
    IslaiduIrasas[] islaidos = new IslaiduIrasas[100];
    static int counter;

    public void setInfo(PajamuIrasas e) {
        for (int i = 0; i < counter + 1; i++) {
            if (pajamos[i] == null) {
                pajamos[i] = e;
            }
        }
        counter++;
    }


    public void getInfoAll() {

        for (int i = 0; i < counter; i++) { //pataisyti, kad iteruotu per egzistuojancius tiktai

            System.out.println("Suma : " + pajamos[i].getSuma());
            System.out.println("Pajamu iraso data : " + pajamos[i].getData());
            System.out.println("Pajamu kategorija : " + pajamos[i].getKategorija());
            System.out.println("Ar pajamos gautos pavedimu i banko saskaita : " + pajamos[i].getPozymisArIBanka());
            System.out.println("Papildoma informacija : " + pajamos[i].getPapildomaInfo());
            System.out.println("-----------------------------------------------");

        }
    }
}
