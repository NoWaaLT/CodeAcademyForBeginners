package interfaceEx2;

public class Svoriai extends Vertinimas{

    private int bendrasBalas = 150;
    private double surinktiBalai1;
    private double surinktiBalai2;
    private double surinktiBalai3;
    private double pemproc = bendrasBalas * 0.5;
    private double desmtproc = bendrasBalas * 0.1;
    private double kemproc = bendrasBalas * 0.4;
    private double total;

    @Override
    public void galutinisBalas() {
        surinktiBalai1 = pemproc/ 10 * grade1;
        surinktiBalai2 = desmtproc  / 10 * grade2;
        surinktiBalai3 = kemproc  / 10 * grade3;
        total = surinktiBalai1 + surinktiBalai2 + surinktiBalai3;


        System.out.println("1. " + surinktiBalai1 + " / " + pemproc);
        System.out.println("2. " + surinktiBalai2 + " / " + desmtproc);
        System.out.println("3. " + surinktiBalai3 + " / " + kemproc);
        System.out.println("Total : " + total + "/" + bendrasBalas);
    }
}
