package lt.codeacademy.uzduotys;

public class keitimasVietom {

    public static void main(String[]args) {
        int a = 5;
        int b = 10;
        System.out.println(a);
        System.out.println(b);

        a = a ^ b;

        b = a ^ b;

        a = a ^ b;

        System.out.println("a :" + a);
        System.out.println("b :" + b);
    }

}
