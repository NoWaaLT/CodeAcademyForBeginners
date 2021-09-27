public class PajamuIrasas extends Biudzetas {

    private int suma;
    private String data;
    private String kategorija; // pajamos ar islaidos
    private String pozymisArIBanka;
    private String papildomaInfo;

    PajamuIrasas(){

    }

    PajamuIrasas(int suma) {
        this.suma = suma;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }
}
