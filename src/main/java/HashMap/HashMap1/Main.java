package HashMap.HashMap1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public static void main(String[] args) {

    HashMap<Integer, String> passportsAndNames = new HashMap<>();

    passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
    passportsAndNames.put(162348, "Иван Михайлович Серебряков");
    passportsAndNames.put(8082771, "Дональд Джон Трамп");

    Set<Integer> keys = passportsAndNames.keySet();
    System.out.println("Ключи: " + keys);

    ArrayList<String> values = new ArrayList<>();
    System.out.println("Значения: " + values);

}
