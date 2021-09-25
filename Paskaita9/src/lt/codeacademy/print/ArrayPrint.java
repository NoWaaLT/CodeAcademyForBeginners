package lt.codeacademy.print;

public class ArrayPrint {
    public static void main(String[] args) {
        int[] numbers = {4,5,6,8,11,25,146};
        Printer array1 = new Printer();

        array1.arrayPrinter(numbers);
    }
}
class Printer {
    void arrayPrinter(int[]pNumbers) {
        int[]methodArray = pNumbers;
        for (int i = 0; i < methodArray.length; i++) {
            System.out.println(methodArray[i]);
        }

    }
}

