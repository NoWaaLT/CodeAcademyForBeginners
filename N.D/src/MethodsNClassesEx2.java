public class MethodsNClassesEx2 {
    public static void main(String[] args) {
        Fraction frac = new Fraction();
        frac.setFraction(10, 15);
        frac.simplify();
        frac.print();

    }
}

class Fraction {
    private int e, d; // for fraction counter and multiplier store
    private int gcd; // for greatest common divider

    void setFraction(int e, int d) {
        this.e = e;
        this.d = d;
    }

    void print() {
        System.out.println(e + " / " + d);
    }

    void simplify() {
        gcd2(e, d);
        e = e / gcd;
        d = d / gcd;

    }

    private int gcd2(int e, int d) {
        for (int i = 1; i <= e && i <= d; i++) {
            if (e % i == 0 && d % i == 0)
                gcd = i;
        }
        return gcd;
    }
}








