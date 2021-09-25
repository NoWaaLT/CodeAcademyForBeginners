import java.util.Scanner;
public class WhileCiklas {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number :");
        int skaicius = scn.nextInt();
        while (skaicius > 0) {
            System.out.println("Enter another number :");
            skaicius++;
        if (skaicius <= 0 ) {
            break;
        }
        }


    }
}
