package lt.codeacademy.bonus;

import java.util.Scanner;

public class Figure {
    private String figureName;
    private float height;
    private float width;
    Scanner sc = new Scanner(System.in);

    public String getFigureName() {
        return figureName;
    }

    public void setFigureName() {
        System.out.println("Enter name of figure : ");
        String pFigureName = sc.nextLine();
        this.figureName = pFigureName;
    }

    public float getFigureHeight() {
        return height;
    }

    public void setFigureheight() {
        System.out.println("Enter height of figure : ");
        float pFigureHeight = sc.nextFloat();
        this.height = pFigureHeight;

    }

    public float getFigureWidth() {
        return width;
    }

    public void setFigureWidth() {
        System.out.println("Enter width of figure : ");
        float pFigureWidth = sc.nextFloat();
        this.width = pFigureWidth;
    }

  /*  @Override
    public String toString() {
        return "Figure{" +
                "figureName='" + figureName + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}'; */
}
