package interfaceEx2;

public class VisiIslaikyti extends Vertinimas{
private int smallGrade = 4;
private int gradeNum = 3;

    @Override
    public void galutinisBalas() {

        if (grade1 > smallGrade && grade2 > smallGrade && grade3 > smallGrade) {
            System.out.println((grade1 + grade2 + grade3) / gradeNum);

        }

        else if (grade1 < 5 || grade2 < 5 || grade3 < 5) {
            System.out.println(0);
        }


    }
}
