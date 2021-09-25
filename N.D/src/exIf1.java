import java.util.Scanner;
public class exIf1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite tekstą : ");
        String text = sc.next();

        if (text.contains("2") || text.contains("5") || text.contains("a")) {
            System.out.println("Tekstas neteisingas!");

        }
        sc.close();
    }
}
