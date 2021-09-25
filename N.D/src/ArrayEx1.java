/* Sukurti masyvą, kurio dydis turi priklausyti nuo vartotojo
įvedamo skaičiaus. Jei skaičius didesnis nei 7, programa
Sukuria masyvą, kurio ilgis yra atsitiktinai
sugeneruojamas bet maksimum 8.
Pirmasis ir paskutinis elementai yra tokie patys skaičiai,
kaip ir masyvo ilgis. */

import java.util.Scanner;
import java.util.Random;

public class ArrayEx1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Enter an Array length :");
        int leng = sc.nextInt();
        int []arrayExample = new int[leng];
        if (leng > 7) {
            leng = rnd.nextInt(8);
        }
        arrayExample[0] = leng;
        arrayExample[arrayExample.length - 1] = leng;
        System.out.println(arrayExample[0]);
        System.out.println(arrayExample[arrayExample.length - 1]);


    }
}
