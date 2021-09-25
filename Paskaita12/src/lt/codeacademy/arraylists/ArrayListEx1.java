package lt.codeacademy.arraylists;
// Need to check this exercise again
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>(); // creating an array list
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter new word to list : ");
            list.add(sc.nextLine());
            int arraySize = list.size();
            System.out.println("List : " + list + ", array size : " + arraySize);

            if (arraySize == 5) {
                list.clear();
            }  else if (list.contains(sc.nextLine())) {
                System.out.println("Enter other word!");
            }

        }
    }


}
