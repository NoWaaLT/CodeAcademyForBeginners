/* 3, 6 ,8 ,7, 9 // didejim
 * 9, 4, 6, 2, 6 // mazejimo
 * 2, 5, 1, 9, 3 // didejimo
 * 6, 3 ,8, 1 ,5 // mazejimo
 *
 * Reikai užbaigti
 * */

public class KataBubble {

    public static void main(String[] args) {

        int first = 0;
        int temp = 0;
        int[] numbers = {3, 6, 8, 7, 9};
        int[] numbers1 = {9, 4, 6, 2, 6};
        int[] numbers2 = {2, 5, 1, 9, 3};
        int[] numbers3 = {6, 3, 8, 1, 5};

        int turn = numbers.length - 1;
        int len = numbers.length;
        System.out.print("{");
        for (int i = 0; i < len; i++) {
            System.out.print(numbers[i]);
            if (i < len - 1) {
                System.out.print(" ,");
            }
        }
        System.out.println("}");

        System.out.print("{");
        for (int i = 0; i < len; i++) {
            System.out.print(numbers1[i]);
            if (i < len - 1) {
                System.out.print(" ,");
            }

        }
        System.out.println("}");
        System.out.print("{");
        for (int i = 0; i < len; i++) {
            System.out.print(numbers2[i]);
            if (i < len - 1) {
                System.out.print(" ,");
            }

        }
        System.out.println("}");
        System.out.print("{");
        for (int i = 0; i < len; i++) {
            System.out.print(numbers3[i]);
            if (i < len - 1) {
                System.out.print(" ,");
            }
        }
        System.out.println("}");
        System.out.println("--------------------");

        while (first < turn - 1) {
            for (int i = 0; i < 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    temp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = temp;

                } else {
                    first++;
                }
                for (int j = 1; j < 2; j++) {
                    if (numbers[j] > numbers[j + 1]) {
                        temp = numbers[j + 1];
                        numbers[j + 1] = numbers[j];
                        numbers[j] = temp;

                    } else {
                        first++;

                    }
                    for (int k = 2; k < 3; k++) {
                        if (numbers[k] > numbers[k + 1]) {
                            temp = numbers[k + 1];
                            numbers[k + 1] = numbers[k];
                            numbers[k] = temp;
                        } else {
                            first++;

                        }
                        for (int l = 3; l < 4; l++) {
                            if (numbers[l] > numbers[l + 1]) {
                                temp = numbers[l + 1];
                                numbers[l + 1] = numbers[l];
                                numbers[l] = temp;
                            } else {
                                first++;

                            }
                            for (int number : numbers) {
                                System.out.println(number);
                            }
                            System.out.println("-------------------");
                        }
                    }
                }
            }
        }
    }
}

