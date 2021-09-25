public class Methods {
    public static void main(String[] args) {
        System.out.println("Calling a method m1");
        m1();
    }

    private static void m1() {
        System.out.println("First method");
        m2();
    }

    private static void m2() {
        System.out.println("Second method");
        m3();
    }

    private static void m3() {
        System.out.println("Third method");
    }
}
