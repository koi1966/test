package Map;

import java.util.*;
import java.util.stream.Collectors;

public class ListMap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "Франция", "Германия", "Монако", "Испания", "Италия",
                "Австрия", "Испания", "Монако", "Грузия", "Монако",
                "Испания", "Италия", "Монако", "Сингапур", "Армения");

        Map<String, Integer> frequency = list.stream()
                // собираем элементы листа в карту
                .collect(Collectors.toMap(
                        // ключ - строка
                        e -> e,
                        // значение - число,
                        // количество вхождений
                        e -> 1,
                        // суммируем количество вхождений
                        Integer::sum));
// Выводим значение по ключу
        System.out.println("Испания: " + frequency.get("Испания")); // Испания: 3
//        frequency.values().

// Обходим карту и выводим содержимое
        frequency.forEach((k, v) -> System.out.println(k + ": " + v));
// Италия: 2
// Франция: 1
// Австрия: 1
// Армения: 1
// Монако: 4
// Испания: 3
// Грузия: 1
// Сингапур: 1
// Германия: 1

        List<String> phones = new ArrayList<String>();
        Collections.addAll(phones, "iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");

        List<String> filteredPhones = phones.stream()
                .filter(s -> s.length() < 10)
                .collect(Collectors.toList());

        for (String s : filteredPhones) {
            System.out.println(s);
        }

    }
}
