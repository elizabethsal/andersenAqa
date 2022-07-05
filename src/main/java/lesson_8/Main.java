package lesson_8;


import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        homeAssignment();
        Directory directory = new Directory();

        directory.add("Lafeison", "995595410678");
        directory.add("Stark", "995597675342");
        directory.add("Barnes", "99559879497");
        directory.add("Romanov", "99559588888");
        directory.add("Odinson", "9955505697666");
        directory.add("Odinson", "9955505697666");
        directory.add("Romanov", "99559588888");
        directory.add("Barnes", "99559879497");


        System.out.println(directory.get("F"));

    }


    public static void homeAssignment() {

        Map<String, Integer> ha = new HashMap<>();
        String[] words = {"List", "Hash", "Map", "Object", "Set",
                "Streams", "Queue","Queue","Queue","Queue","Queue","Queue", "Data structure","Queue","Queue","Queue", "HashMap", "ArrayList",
                "Object", "List", "Structure", "Streams", "Set"};
        for (int i = 0; i < words.length; i++) {
            if (ha.containsKey(words[i])) {
                ha.put(words[i], ha.get(words[i]) + 1);
            } else {
                ha.put(words[i], 1);
            }
        }
        System.out.println(ha);
    }

}


