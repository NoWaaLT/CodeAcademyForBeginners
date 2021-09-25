package lt.codeacademy.inheritence;

public class LietuviskasVaisius extends Vaisius{
    int kiekis;
    public LietuviskasVaisius(String vaisiausPavadinimas) {
        super(vaisiausPavadinimas);
    }

    public int getKiekis() {
        return kiekis;
    }

    public void setKiekis(int kiekis) {
        this.kiekis = kiekis;
    }
}
