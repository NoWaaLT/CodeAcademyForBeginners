public class Circle {

    private static double r;

    public static void main(String[] args) {

        Circle shape = new Circle();

        shape.set(15.5);

    System.out.println("Circle area is : " + shape.area());
    }


    public void set(double r) {
         this.r = r; // this shows to compiler that r belongs to class, not to parameter
    }

    double area() {
        double pi = 3.14;
        r = pi * (r * r); // Formula for circle area is 3,14 * r^2
        return r;
    }
}
