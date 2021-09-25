package lt.codeacademy.arraylists;

import java.util.ArrayList;

public class ArrayListEx2 {

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("One");
        stringList.add("Two");
        stringList.add("Three");
        stringList.add("Four");
        stringList.add("Five0000");
        stringList.add("Six");
        stringList.add("Seven");
        stringList.add("Eight");
        stringList.add("Nine");
        stringList.add("Twenty");

        String longestWord = "";

        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).length() > longestWord.length()) {
                longestWord = stringList.get(i);
            }
        }
        System.out.println("Longest word is : " + longestWord);
    }
}
