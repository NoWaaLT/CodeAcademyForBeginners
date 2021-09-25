package interfaceEx2;

public abstract class Vertinimas {
    int grade1;
    int grade2;
    int grade3;

    void setGrade(int pGrade1, int pGrade2, int pGrade3) {
        grade1 = pGrade1;
        grade2 = pGrade2;
        grade3 = pGrade3;
    }
    public abstract void galutinisBalas();
}
