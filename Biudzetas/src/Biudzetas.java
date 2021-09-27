import java.util.Arrays;

public class Biudzetas {

    PajamuIrasas[] pajamos = new PajamuIrasas[100];
    IslaiduIrasas[] islaidos = new IslaiduIrasas[100];



    public void setPajamos(PajamuIrasas[] pajamos) {
        this.pajamos = pajamos;
    }

    public void setIslaidos(IslaiduIrasas[] islaidos) {
        this.islaidos = islaidos;
    }

    public PajamuIrasas[] getPajamos() {
        return pajamos;
    }

    public IslaiduIrasas[] getIslaidos() {
        return islaidos;
    }
}
