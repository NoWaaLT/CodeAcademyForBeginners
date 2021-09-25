public class Ciklai {
    public static void main(String[] args) {
        int skaicius = 10;

        for (int i = 1; i <= skaicius; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i<=10;i++) {
            System.out.println();
        }
    }
}
