public class exArray {
    public static void main(String[] args) {

        String[] names = {"Roma", "Kestutis", "Martynas", "Jonas", "Laimonas"};

        int index = 0;

        for (int i = 0; i < names.length; i++) {
            if (names[i] == "Roma") {
                index = i;
            }
        }
        int index1 = 0;

        for (int i = 0; i < names.length; i++) {
            if (names[i] == "Kestutis") {
                index1 = i;
            }
        }
        int index2 = 0;

        for (int i = 0; i < names.length; i++) {
            if (names[i] == "Martynas") {
                index2= i;
            }
        }
        int index3 = 0;

        for (int i = 0; i < names.length; i++) {
            if (names[i] == "Jonas") {
                index3 = i;
            }
        }
        int index4 = 0;

        for (int i = 0; i < names.length; i++) {
            if (names[i] == "Laimonas") {
                index4 = i;
            }
        }

        System.out.println(names[0].toUpperCase() + " - " + names[0].length() + " - " + index);
        System.out.println(names[1].toUpperCase() + " - " + names[1].length() + " - " + index1);
        System.out.println(names[2].toUpperCase() + " - " + names[2].length() + " - " + index2);
        System.out.println(names[3].toUpperCase() + " - " + names[3].length() + " - " + index3);
        System.out.println(names[4].toUpperCase() + " - " + names[4].length() + " - " + index4);


        }
    }

