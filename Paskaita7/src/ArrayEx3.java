/* 1. Deklaruokite sveikuju skaiciu masyva m ir ji sukurkite; +
* 2. Tegu jo dydys buna ivedas vartotojo per konsole; +
* 3. Praeikite masyva m ciklo pagalba nuo paskutines pozicijos iki pirmos ir praeidami priskirkite masyvo elementams reiksmes
* atitinkancius pozicijos numerius, o taip pat jei lyginis paliekam, jei nelyginis - neigiamu paverciam ; +
* 4. Atspausdiname +
* 5. Praeikite masyvą vėl ir pozicijose kuriu numeriai dalinasi is 3 be liekanos, reiksmes padauginkite is dvieju; +
* 6. Panaudokite ciklo kintamajame zingsni 2 bei masyva praeikite nuo galo (vienos iteracijos metu spaudinkite du elementus)
 */
import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array :");
        int num = sc.nextInt(); // jo dydis priklasuo nuo parametro
        int[] m = new int[num]; // sukurem masyva
        for (int i = num - 1; i >= 0; i--) { // praeiname nuo pabaigos iki pradzios
            m[i] = i; // priskiriam reiksmes
            if (m[i] % 2 != 0) {
                m[i] = m[i] * -1; // priskiriam neigiam
            }
            System.out.println(m[i]); // 4. atspausdinam
        }
        System.out.println("--------------------");
        for (int i = 0; i < num; i++) {
            if (m[i] % 3 == 0) {
                m[i] = m[i] * 2; // padauginam is dvieju

            }
            System.out.println(m[i]);
        }
        System.out.println("--------------------");
        for (int i = num - 1; i > 0; i-=2) {
                System.out.println(m[i]);
                System.out.println(m[i - 1]);
        }
    }
}
