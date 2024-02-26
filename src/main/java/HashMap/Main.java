package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNamesMain = new HashMap<>();

        passportsAndNamesMain.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNamesMain.put(162348, "Иван Михайлович Серебряков");
        passportsAndNamesMain.put(8082771, "Дональд Джон Трамп");

        Set<Integer> keys = passportsAndNamesMain.keySet();
        System.out.println("Ключи: " + keys);

        ArrayList<String> values = new ArrayList<>(passportsAndNamesMain.values());
        System.out.println("Значения: " + values);


    }
}
