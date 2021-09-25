package lt.codeacademy.figure;

public class Figure {
    private String figureName;
    private int heigth;
    private int width;
    private int area;

    public void setFigureName(String pFigureName) {
        this.figureName = pFigureName;
    }
    public String getFigureName() {
        return figureName;
    }
    public void setHeight(int pHeigth) {
        this.heigth = pHeigth;
    }
    public int getHeigth() {
        return heigth;
    }
    public void setWidth(int pWidth) {
        this.width = pWidth;
    }
    public int getWidth() {
        return width;
    }
    public int getArea() {
        this.area = heigth * width;
        return area;
    }
}
