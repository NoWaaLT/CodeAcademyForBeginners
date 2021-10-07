public class PajamuIrasas extends Biudzetas {

    private int suma;
    private String data;
    private String kategorija; // pajamos ar islaidos
    private String pozymisArIBanka;
    private String papildomaInfo;
    private int id;

    PajamuIrasas() {

    }

    PajamuIrasas(int suma, String data, String kategorija, String pozymisArIBanka, String papildomaInfo, int id) {
        this.suma = suma;
        this.data = data;
        this.kategorija = kategorija;
        this.pozymisArIBanka = pozymisArIBanka;
        this.papildomaInfo = papildomaInfo;
        this.id = id;
        Biudzetas.counter++;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getSuma() {
        return suma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
