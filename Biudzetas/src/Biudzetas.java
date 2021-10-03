public class Biudzetas {

    PajamuIrasas[] pajamos = new PajamuIrasas[100];
    IslaiduIrasas[] islaidos = new IslaiduIrasas[100];
    static int counter, counter2;

    public void setInfo(PajamuIrasas e) {
        for (int i = 0; i < counter + 1; i++) {
            if (pajamos[i] == null) {
                pajamos[i] = e;
            }
        }
        counter++;
    }

    public void setInfo(IslaiduIrasas d) {
        for (int i = 0; i < counter2 + 1; i++) {
            if (islaidos[i] == null) {
                islaidos[i] = d;
            }
        }
        counter2++;
    }


    public void getPajamosInfoAll() {

        for (int i = 0; i < counter; i++) {

            System.out.println("Suma : " + pajamos[i].getSuma());
            System.out.println("Pajamu iraso data : " + pajamos[i].getData());
            System.out.println("Pajamu kategorija : " + pajamos[i].getKategorija());
            System.out.println("Ar pajamos gautos pavedimu i banko saskaita : " + pajamos[i].getPozymisArIBanka());
            System.out.println("Papildoma informacija : " + pajamos[i].getPapildomaInfo());
            System.out.println("-----------------------------------------------");

        }
    }
    public void getPajamosSingleInfo(int indeksoNr) {
        System.out.println("Irasas indeksu " + indeksoNr + " : ");
        System.out.println("Suma : " + pajamos[indeksoNr].getSuma());
        System.out.println("Pajamu iraso data : " + pajamos[indeksoNr].getData());
        System.out.println("Pajamu kategorija : " + pajamos[indeksoNr].getKategorija());
        System.out.println("Ar pajamos gautos pavedimu i banko saskaita : " + pajamos[indeksoNr].getPozymisArIBanka());
        System.out.println("Papildoma informacija : " + pajamos[indeksoNr].getPapildomaInfo());
        System.out.println("-----------------------------------------------");
    }
    public void getIslaidosInfoAll() {
        for (int i = 0; i < counter2; i++) {
            System.out.println("Islaidu suma : " + islaidos[i].getSuma());
            System.out.println("Islaidu iraso data : " + islaidos[i].getDataSuLaiku());
            System.out.println("Islaidu kategorija : " + islaidos[i].getKategorija());
            System.out.println("Atsiskaitymo budas : " + islaidos[i].getPozymisArIBanka2());
            System.out.println("Papildoma informacija : " + islaidos[i].getPapildomaInfo());
            System.out.println("-----------------------------------------------");
        }
    }
    public void getIslaidosSingleInfo(int indeksoNr) {
        System.out.println("Irasas indeksu " + indeksoNr + " : ");
        System.out.println("Suma : " + islaidos[indeksoNr].getSuma());
        System.out.println("Islaidu iraso data : " + islaidos[indeksoNr].getDataSuLaiku());
        System.out.println("Islaidu kategorija : " + islaidos[indeksoNr].getKategorija());
        System.out.println("Atsiskaitymo budas : " + islaidos[indeksoNr].getPozymisArIBanka2());
        System.out.println("Papildoma informacija : " + islaidos[indeksoNr].getPapildomaInfo());
        System.out.println("-----------------------------------------------");
    }
}
