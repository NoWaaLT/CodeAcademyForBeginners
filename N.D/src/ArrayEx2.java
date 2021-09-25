/* Sukurti masyvą, kurio dydis būtų 4.
Turite žodį “Java”.
Surašykite Visas žodžio raides į masyvą, kad atitiktų indeksai
ir įrašymo metu, paverskite viską didžiosiomis raidėmis. */

public class ArrayEx2 {
    public static void main(String[] args) {
        String word = "Java";
        int leng = word.length();
        char[] characters = new char[leng];

        for (int i = 0; i < leng; i++) {
            characters[i] = word.charAt(i);
        }
        for (int i = 0; i < leng; i++) {
            System.out.println(characters[i]);
        }

    }
}
