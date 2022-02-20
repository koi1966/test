import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
    }
}
