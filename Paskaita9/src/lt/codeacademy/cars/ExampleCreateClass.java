// Create a car class with variable and get and set methods.

package lt.codeacademy.cars;

import java.util.Scanner;

public class ExampleCreateClass {
    private String carName;
    private int carYear;
    private String carColor;
    Scanner sc = new Scanner(System.in);

    public void setCarName() {
        System.out.println("Enter a car name : ");
        String pCarName = sc.nextLine();
        this.carName = pCarName;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarYear() {
        System.out.println("Enter manufacture year :");
        int pCarYear = sc.nextInt();
        this.carYear = pCarYear;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarColor() {
        System.out.println("Enter a color of car : ");
        String pCarColor = sc.nextLine();
        this.carColor = pCarColor;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarNameNColorNYear() {
        System.out.println("Enter a name of car : ");
        String pCarName = sc.nextLine();
        this.carName = pCarName;
        System.out.println("Enter a color of car :");
        String pCarColor = sc.nextLine();
        this.carColor = pCarColor;
        System.out.println("Enter manufacture year of car :");
        int pCarYear = sc.nextInt();
        this.carYear = pCarYear;
    }


    @Override
    public String toString() {
        return "Car details : \n" +
                "Car name : " + carName + "\n" +
                "Manufacture year : " + carYear + "\n" +
                "Color of a car : " + carColor;
    }

    public void setCarName (String pCarName) {
        this.carName = pCarName;
    }
    public String getCarName2 () {
        return carName;
    }

}
