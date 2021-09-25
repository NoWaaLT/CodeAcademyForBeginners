package lt.codeacademy.cars;

import lt.codeacademy.cars.ExampleCreateClass;

import java.util.Scanner;

public class AllCars {
    public static void main(String[] args) {
        ExampleCreateClass car = new ExampleCreateClass();
        car.setCarName();
        car.setCarColor();
        car.setCarYear();
        System.out.println(car.toString());

        System.out.println("------------------");

        ExampleCreateClass car2 = new ExampleCreateClass();
        car2.setCarName();
        car2.setCarColor();
        car2.setCarYear();
        System.out.println(car2.toString());

        System.out.println("------------------");

        ExampleCreateClass car3 = new ExampleCreateClass();
        car3.setCarName();
        car3.setCarColor();
        car3.setCarYear();
        System.out.println(car3.toString());

        System.out.println("------------------");

        ExampleCreateClass car4 = new ExampleCreateClass();
        car4.setCarNameNColorNYear();
        System.out.println(car4.toString());

        System.out.println("------------------");

        ExampleCreateClass car5 = new ExampleCreateClass();
        car5.setCarName("Lamborghini");
        System.out.println(car5.getCarName2());
    }
}
