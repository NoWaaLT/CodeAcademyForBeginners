/* Write a Java program to get the character
 * (Unicode code point) at the given index
 * within the String.
 * Output:
 * Original string : As labai myliu Java
 * Character(unicode number) is : 115 /s
 * Character(unicode number) is : 109 /m
 */

public class String2 {
    public static void main(String[] args) {
        String original = "As labai myliu Java"; // Apsirasom pirma ka reiskia tie skaiciai su char, randame index pagal tuos skaicius

        System.out.println("Original String = As labai myliu Java");

        char pirmas = original.charAt(1);
        int ss = (char) pirmas;
        System.out.println("Character(unicode number) is : " + ss);

        int pirmas1 = original.charAt(1);
        System.out.println("Character(unicode number) is : " + pirmas1);

        int pirmas2 = original.codePointAt(1); // gražina nurodyto index'o reikšmę unicode skaiciais.
        System.out.println(pirmas2);

        char antras = original.charAt(9);
        int ss1 = (char) antras;
        System.out.println("Character(unicode number) is : " + ss1);


    }
}
