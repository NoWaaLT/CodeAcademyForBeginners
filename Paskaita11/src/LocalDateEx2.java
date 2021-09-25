/* Paprašyti vartotojo įvesti laiką•
Prie įvesto laiko pridėti 2val. ir 15 min.
•Gautą laiką atspausdinti į ekraną
•Patikrinti, ar įvestas laikas yra ankstesnis už dabarties laiką.
*/

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateEx2 {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);


        DateTimeFormatter newTimeFormat = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(newTimeFormat);
    }
}