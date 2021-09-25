package lt.codeacademy.exercises;
import java.util.Scanner;
public class Execute {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius of circle : ");
        circle.setR(sc.nextDouble());
        System.out.println("The area of circle is : " + circle.area());


        System.out.println("----------------");

        Rectangle rect = new Rectangle();
        System.out.println("Enter a length and height of circle : ");
        rect.set(sc.nextDouble(), sc.nextDouble());
        rect.area();
        System.out.println("The area of rectangle is : " + rect.area());

        sc.close();
    }
}
