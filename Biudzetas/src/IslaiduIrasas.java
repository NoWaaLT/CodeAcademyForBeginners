public class IslaiduIrasas extends Biudzetas{

    private String suma;
    private String dataSuLaiku;
    private String kategorija; // pajamos ar islaidos
    private String pozymisArIBanka2;
    private String papildomaInfo;

    IslaiduIrasas(String suma,String dataSuLaiku, String kategorija, String atsiskaitymoBudas, String papildomaInfo) {
        this.suma = suma;
        this.dataSuLaiku = dataSuLaiku;
        this.kategorija = kategorija;
        this.pozymisArIBanka2 = atsiskaitymoBudas;
        this.papildomaInfo = papildomaInfo;
    }

    public String getSuma() {
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
