public class IslaiduIrasas extends Biudzetas {

    private int suma;
    private String dataSuLaiku;
    private String kategorija; // pajamos ar islaidos
    private String pozymisArIBanka2;
    private String papildomaInfo;
    private int id;



    IslaiduIrasas(int suma, String dataSuLaiku, String kategorija, String atsiskaitymoBudas, String papildomaInfo, int id) {
        this.suma = suma;
        this.dataSuLaiku = dataSuLaiku;
        this.kategorija = kategorija;
        this.pozymisArIBanka2 = atsiskaitymoBudas;
        this.papildomaInfo = papildomaInfo;
        this.id = id;
        Biudzetas.counter2++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSuma() {
        return suma;
    }

    public String getDataSuLaiku() {
        return dataSuLaiku;
    }

    public String getKategorija() {
        return kategorija;
    }

    public String getPozymisArIBanka2() {
        return pozymisArIBanka2;
    }

    public String getPapildomaInfo() {
        return papildomaInfo;
    }
}
