import java.util.Scanner;
public class exIf3 {
    public static void main(String[] args) {
        int numb;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        numb = sc.nextInt();
        if (numb % 2 != 0) {
            System.out.println("Skaičius nėra lyginis!");
        }
        sc.close();
    }
}
