public class MethodsNClassesEx1 {
    public static void main(String[] args) {

        Circle2 shape = new Circle2();

        System.out.println("The shape area is : " + shape.area());

        Rectangle rect = new Rectangle();

        System.out.println("The shape area is : " + rect.getA());
    }


}

class Circle2 {

    private double r;

    public void setR(double r) {
        this.r = r;

    }

    double area() {
        setR(15.5);
        double pi = 3.14;
        r = pi * (r * r); // Formula for circle area is 3,14 * r^2
        return r;
    }

}

class Rectangle {
    private double a, b; // for rectangle width and length

    void set(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        set(10.5, 6.5);
        a = a * b;
        return a;
    }


}



