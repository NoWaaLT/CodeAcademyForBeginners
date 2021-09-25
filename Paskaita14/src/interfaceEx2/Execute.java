package interfaceEx2;

public class Execute {
    public static void main(String[] args) {
        Svoriai ex = new Svoriai();

        ex.setGrade(6, 5 ,7);
        ex.galutinisBalas();

        System.out.println("_____________________________________");
        VisiIslaikyti visiEx1 = new VisiIslaikyti();

        visiEx1.setGrade(8, 10, 4);
        visiEx1.galutinisBalas();
    }
}
