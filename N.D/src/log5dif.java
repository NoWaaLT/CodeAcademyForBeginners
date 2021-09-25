/* Write a Java program that reads in two floating-point
numbers and tests whether they are the same
up to three decimal places. */


public class log5dif {
    public static void main(String[] args) {
        float num1 = 25.45678f;
        float num2 = 25.47894f;

        float num1round = Math.round(num1*1000f)/1000f;
        System.out.println("First rounded number is : " + num1round);
        float num2round = Math.round(num2*1000f)/1000f;
        System.out.println("Second rounded number is : " + num2round);

        if (num1round != num2round) {
            System.out.println("The numbers are different");
        }
        else {
            System.out.println("Numbers are equal");
        }
    }
}
