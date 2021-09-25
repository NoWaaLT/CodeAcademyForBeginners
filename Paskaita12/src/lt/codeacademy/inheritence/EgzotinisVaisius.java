package lt.codeacademy.inheritence;

public class EgzotinisVaisius extends Vaisius {
    String spalva;

    public EgzotinisVaisius(String vaisiausPavadinimas, String spalva) {
        super(vaisiausPavadinimas);
        this.spalva = spalva;
    }

    public String getSpalva() {
        return spalva;
    }

    public void setSpalva(String spalva) {
        this.spalva = spalva;
    }
}
