import java.util.Scanner;
public class exIf4 {
    public static void main(String[] args) {
        int first, second, third;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number :");
        first = sc.nextInt();
        System.out.println("Enter 2nd number :");
        second = sc.nextInt();
        System.out.println("Enter 3rd number :");
        third = sc.nextInt();
        if (first > second && first > third) {
            System.out.println("The highest number is :" + first);
        }
        else if (second > first && second > third) {
            System.out.println("The highest number is :" + second);
        }
        else {
            System.out.println("The highest number is : " + third);
        }
        sc.close();
    }
}
