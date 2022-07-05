package lesson_8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Directory {
    private final Map<String, List<String>> directoryPhone = new HashMap<>();

    public void add(String surname, String phone_number) {
        List<String> phone_number_list;
        if (directoryPhone.containsKey(surname)) {
            phone_number_list = directoryPhone.get(surname);
        } else {
            phone_number_list = new ArrayList<>();
        }
        phone_number_list.add(phone_number);
        directoryPhone.put(surname, phone_number_list);
    }

    public List<String> get(String surname) {
        if(!directoryPhone.containsKey(surname)){
            throw new IllegalArgumentException("This name is not present in directory");
        }
        return directoryPhone.get(surname);
    }


}
