public class PajamuIrasas extends Biudzetas {

    private int suma;
    private int totalSuma;
    private String data;
    private String kategorija; // pajamos ar islaidos
    private String pozymisArIBanka;
    private String papildomaInfo;

    PajamuIrasas() {

    }

    PajamuIrasas(int suma, String data, String kategorija, String pozymisArIBanka, String papildomaInfo) {
        this.suma = suma;
        this.data = data;
        this.kategorija = kategorija;
        this.pozymisArIBanka = pozymisArIBanka;
        this.papildomaInfo = papildomaInfo;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getSuma() {
        return suma;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public String getPozymisArIBanka() {
        return pozymisArIBanka;
    }

    public void setPozymisArIBanka(String pozymisArIBanka) {
        this.pozymisArIBanka = pozymisArIBanka;
    }

    public String getPapildomaInfo() {
        return papildomaInfo;
    }

    public void setPapildomaInfo(String papildomaInfo) {
        this.papildomaInfo = papildomaInfo;
    }
}
