public class String3 {
    public static void main(String[] args) {
        String first = "This is Exercise 1";
        String second = "This is Exercise 2";

        System.out.println("First string is : " + first);
        System.out.println("Second string is : " + second);

        int skirtumas = first.compareTo(second);

        if (skirtumas < 0) {
            System.out.println("\"" + first + "\"" + " is less than " + "\"" + second + "\"");
        } else if (skirtumas == 0) {
            System.out.println("\"" + first + "\"" + " is equal to " + "\"" + second + "\"");
        } else {
            System.out.println("\"" + first + "\"" + " is greater than " + "\"" + second + "\"");
        }

    }
}
