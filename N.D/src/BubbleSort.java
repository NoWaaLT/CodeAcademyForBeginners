public class BubbleSort {
    public static void main(String[] args) {
        int first = 0, temp = 0;
        int[] array1 = {99, 88, 55, 77, 1, 66};
        int turn = array1.length - 1;


        for (int number : array1) {
            System.out.println(number);
        }
        System.out.println("-------------------");
        while (first < turn) {
            for (int i = 0; i < 1; i++) {
                if (array1[i] > array1[i + 1]) {
                    temp = array1[i + 1];
                    array1[i + 1] = array1[i];
                    array1[i] = temp;

                } else {
                    first++;
                }
                for (int number : array1) {
                    System.out.println(number);
                }
                System.out.println("-------------------");
                for (int j = 1; j < 2; j++) {
                    if (array1[j] > array1[j + 1]) {
                        temp = array1[j + 1];
                        array1[j + 1] = array1[j];
                        array1[j] = temp;

                    } else {
                        first++;

                    }
                    for (int number : array1) {
                        System.out.println(number);
                    }
                    System.out.println("-------------------");
                    for (int k = 2; k < 3; k++) {
                        if (array1[k] > array1[k + 1]) {
                            temp = array1[k + 1];
                            array1[k + 1] = array1[k];
                            array1[k] = temp;
                        } else {
                            first++;

                        }
                        for (int number : array1) {
                            System.out.println(number);
                        }
                        System.out.println("-------------------");
                        for (int l = 3; l < 4; l++) {
                            if (array1[l] > array1[l + 1]) {
                                temp = array1[l + 1];
                                array1[l + 1] = array1[l];
                                array1[l] = temp;
                            } else {
                                first++;

                            }
                            for (int number : array1) {
                                System.out.println(number);
                            }
                            System.out.println("-------------------");
                            for (int m = 4; m < 5; m++) {
                                if (array1[m] > array1[m + 1]) {
                                    temp = array1[m + 1];
                                    array1[m + 1] = array1[m];
                                    array1[m] = temp;
                                } else {
                                    first++;
                                }
                                for (int number : array1) {
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
}