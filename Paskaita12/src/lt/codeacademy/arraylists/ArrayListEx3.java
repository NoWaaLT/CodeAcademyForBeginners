package lt.codeacademy.arraylists;

import java.util.ArrayList;

public class ArrayListEx3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("One");
        list.add("Two");
        list.add("Two");
        list.add("two");
        list.add("Three");
        list.add("Five");
        list.add("One");
        list.add("Six");


        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }

        }
        System.out.println(list);
    }
}
