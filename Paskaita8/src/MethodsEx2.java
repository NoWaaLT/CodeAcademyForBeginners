public class MethodsEx2 {
    public static void main(String[] args) {
        print("Vy", "Tautas", "Java", 48);
        print("Vy", "Tautas", "Java");
        print("Vy", "Tautas");
        print("Vy");
    }

    private static void print(String name, String surname, String language, int length) {
        System.out.println("I am " + name + " " + surname + " I will definitely learn " + language + " language in " + length + " weeks.");
    }
    private static void print(String name, String surname, String language) {
        System.out.println("I am " + name + " " + surname + " I will definitely learn " + language + " language.");
    }
    private static void print(String name, String surname) {
        System.out.println("I am " + name + " " + surname);
    }
    private static void print(String name) {
        System.out.println("I am " + name);
        print("Ma", "Rius", "C#", 60);
    }


}
