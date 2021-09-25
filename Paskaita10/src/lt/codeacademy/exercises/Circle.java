package lt.codeacademy.exercises;
public class Circle {
    private double r;
    private double pi = 3.14;

    public void setR(double pR) {

        this.r = pR;
    }

    public double area() {
        return 2 * this.pi * this.r;
    }
}
