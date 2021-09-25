package lt.codeacademy.point;

public class Point {
    private double x, y; // to store point coordinates

    public void setX(double pX) {
        this.x = pX;
    }

    public void setY(double pY) {
        this.y = pY;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    void print() {
        System.out.println(x + "," + y);

    }



}
