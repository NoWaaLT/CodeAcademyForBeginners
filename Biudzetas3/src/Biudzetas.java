import java.util.ArrayList;

public class Biudzetas {

    ArrayList<PajamuIrasas> pajamuSarasas = new ArrayList();
    ArrayList<IslaiduIrasas> islaiduSarasas = new ArrayList();
    static int counter, counter2;


    public double Balansas() {
        int balansas = TotalPajamos() - TotalIslaidos();
        System.out.print("Pajamu ir islaidu balansas : ");
        return balansas;
    }

    public int TotalPajamos() {
        int suma = 0;
        for (int i = 0; i < pajamuSarasas.size(); i++) {
            suma += pajamuSarasas.get(i).getSuma();

        }
        return suma;
    }

    public int TotalIslaidos() {
        int iSuma = 0;
        for (int i = 0; i < pajamuSarasas.size(); i++) {
            iSuma += islaiduSarasas.get(i).getSuma();
        }
        return iSuma;
    }

    public void PajamosInfoAll() {
        for (int i = 0; i < pajamuSarasas.size(); i++) {
            System.out.println("Indekso nr : " + i);
            System.out.println(String.format("|Iraso numeris : %31d|", this.pajamuSarasas.get(i).getId()));
            System.out.println(String.format("|Suma : %40s|", this.pajamuSarasas.get(i).getSuma()));
            System.out.println(String.format("|Data : %40s|", this.pajamuSarasas.get(i).getData()));
            System.out.println(String.format("|Kategorija : %34s|", this.pajamuSarasas.get(i).getKategorija()));
            System.out.println(String.format("|Info : %40s|", this.pajamuSarasas.get(i).getPapildomaInfo()));
            System.out.println("-------------------------------------------------");
        }
    }

    public void IslaidosInfoAll() {
        for (int i = 0; i < islaiduSarasas.size(); i++) {
            System.out.println("Indekso nr : " + i);
            System.out.println(String.format("|Iraso numeris : %31d|", this.islaiduSarasas.get(i).getId()));
            System.out.println(String.format("|Suma : %40s|", this.islaiduSarasas.get(i).getSuma()));
            System.out.println(String.format("|Data : %40s|", this.islaiduSarasas.get(i).getDataSuLaiku()));
            System.out.println(String.format("|Kategorija : %34s|", this.islaiduSarasas.get(i).getKategorija()));
            System.out.println(String.format("|Info : %40s|", this.islaiduSarasas.get(i).getPapildomaInfo()));
            System.out.println("-------------------------------------------------");

        }

    }


    public String toStringPajamos(int indeksoNr) {
        return ("Suma : " + this.pajamuSarasas.get(indeksoNr).getSuma() + '\n' +
                " Data : " + this.pajamuSarasas.get(indeksoNr).getData() + '\n' +
                " Kategorija: " + this.pajamuSarasas.get(indeksoNr).getKategorija() + '\n' +
                " Papildoma informacija : " + this.pajamuSarasas.get(indeksoNr).getPapildomaInfo()) + '\n';
    }

    public String toStringIslaidos(int indeksoNr) {
        return ("Suma : " + this.islaiduSarasas.get(indeksoNr).getSuma() + '\n' +
                " Data : " + this.islaiduSarasas.get(indeksoNr).getDataSuLaiku() + '\n' +
                " Kategorija: " + this.islaiduSarasas.get(indeksoNr).getKategorija() + '\n' +
                " Papildoma informacija : " + this.islaiduSarasas.get(indeksoNr).getPapildomaInfo()) + '\n';
    }

}
