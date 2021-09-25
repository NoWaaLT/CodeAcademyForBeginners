package lt.codeacademy.exercises;

//import java.util.Scanner;

public class Rectangle {
    private double a, b; // length and height

    public void set(double pA, double pB) {
        this.a = pA;
        this.b = pB;
    }

    public double area() {
        return this.a * this.b;
    }

}
