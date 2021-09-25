package lt.codeacademy;

public class KataP9Ex1 {
    public static void main(String[] args) {
        char[] mass = {'b', 'c', 'd', 't', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'w', 'n', 'o', 'p', 'q', 'r', 's', 'v', 'x', 'y', 'z', 'u', 'a'};
        int[] mass2 = new int[mass.length];

        for (int i = 0; i < mass.length; i++) {
            mass2[i] = mass[i];
        }
        Arrange(mass2);

        for (int i = 0; i < mass2.length; i++) {
            System.out.println(mass2[i]);
        }

        System.out.println("-------------------");

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (char) mass2[i];
        }
    }
    private static void Arrange(int[] mass2P) {
        for (int i = 0; i < mass2P.length; i++) {
            for (int j = i + 1; j < mass2P.length; j++) {
                if (mass2P[i] > mass2P[j]) {      //swap elements if not in order
                    int temp = mass2P[i];
                    mass2P[i] = mass2P[j];
                    mass2P[j] = temp;
                }
            }
        }
    }
}
