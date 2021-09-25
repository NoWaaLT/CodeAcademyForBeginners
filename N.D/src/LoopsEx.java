/* Parašyti programą, kuri nustato,
ar loterijos bilietas yra laimingas.
Loterijos bilieto šešiaženklis numeris
laikomas laimingu, jei jo pirmų trijų
Skaičių suma yra lygi paskutinių trijų
skaičių sumai, o visi skaitmenys
biliete yra skirtingi. Bilieto
numerį perduokite komandinėje
eilutėje. Pvz: 628745
*/
import java.util.Random;

public class LoopsEx {


    public static void main(String[] args) {
        int min = 000000;
        int max = 999999;
        Random rnd = new Random();
        int loterryNumber = rnd.nextInt(max - min) + min;
        System.out.println(loterryNumber);
    }

}
