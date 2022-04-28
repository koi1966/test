import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {

    public static void main(String[] args) {
        List<Integer> numbers2 = Arrays.asList(1, 3, 5, 7);

        numbers2.stream()
                .map(it -> it * 2)
                .forEach(System.out::println); //output 2 6 10 14

        List<Integer> allow = Arrays.asList(3, 8, 10, 11);
        List<Integer> all = Arrays.asList(1, 5, 10, 8, 12, 15, 9);

        List<Integer> collected = allow.stream().filter(i -> all.stream().anyMatch(n -> n.equals(i))).collect(Collectors.toList());
        System.out.print("Вывод совпадений allow и all ..");
        System.out.println(collected);

        ArrayList listOne = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList listTwo = new ArrayList(Arrays.asList(1, 2, 4, 5, 6, 7));

        listTwo.removeAll(listOne);
        System.out.println("Есть в listTwo, но нет в listOne " + listTwo);


        List<String> intList = java.util.stream.Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
        System.out.println(intList); // больше 3-х символов

        List<String> strings1 = Arrays.asList("43213", "312");

//        Найдите следующий пример нахождения квадрата каждого элемента int с использованием Java 8:

        IntStream ints = Arrays.stream(new int[]{1, 2, 3, 4, 5});
        List<Integer> intsList = ints.map(x -> x * x)
                .collect(ArrayList<Integer>::new, ArrayList::add, ArrayList::addAll);

        System.out.println("=====" + intsList);

//        2. Collect to List + filter Отфильтруем список чисел по четност
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> eveNumbers = new ArrayList<>(numbers.size());
        for (Integer i : numbers) {
            if (i % 2 == 0) {
                eveNumbers.add(i);
            }
        }
        System.out.println("Старый-отфильтруем список чисел по четност -" + eveNumbers.toString()); //output [2, 4, 6, 8, 10]

//        Теперь мы можем использовать методы filter и collect

        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers3 = numbers3.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Новый -Теперь мы можем использовать методы filter и collect -" + evenNumbers3.toString()); //output [2, 4, 6, 8, 10]

        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers4 = numbers4.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("evenNumbers4 -" + evenNumbers4.toString()); //output [2, 4, 6, 8, 10]

//        К счастью, свой коллектор нам писать не нужно т.к. в Java 8 добавили утилитный класс Collectors с необходимыми методами.
//        Collect в сочетании с Collectors.toList возвращают List  (реализация - ArrayList)

//        3. Collect to Set + map Преобразуем список имен в набор(Set) имен в верхнем регистре

        List<String> names = Arrays.asList("John", "Arya", "Sansa");
        Set<String> upperCaseNames = new HashSet<>();
        for (String name : names) {
            upperCaseNames.add(name.toUpperCase());
        }
        System.out.println("Collect to Set + map Преобразуем список имен в набор(Set) имен в верхнем регистре");
        System.out.println(upperCaseNames); //output [ARYA, JOHN, SANSA]

//        Сейчас же мы можем воспользоваться методом map со ссылкой на метод, а так же утилитным классом Collectors

        List<String> names6 = Arrays.asList("John", "Arya", "Sansa");
        Set<String> upperCaseNames6 = names6.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        System.out.println("Новый мотод Collect to Set + map Преобразуем список имен в набор(Set) имен в верхнем регистре");
        System.out.println("upperCaseNames6 -" + upperCaseNames6); //output [ARYA, JOHN, SANSA]

//        Collect в сочетании с Collectors.toSet возвращают Set (реализация -  HashSet)

//        4. Collect to Collection  Соберем список не пустых строк в Queue

        List<String> names8 = Arrays.asList("Jaime", "Daenerys", "", "Tyrion", "");
        Queue<String> queue = new LinkedList<>();
        for (String name : names8) {
            if (!name.isEmpty()) {
                queue.add(name);
            }
        }
        System.out.println("queue -" + queue); //output [Jaime, Daenerys, Tyrion]

        List<String> names9 = Arrays.asList("Jaime", "Daenerys", "", "Tyrion", "");
        Queue<String> queue9 = new LinkedList<>();
        for (String name : names9) {
            if (!name.isEmpty()) {
                queue.add(name);
            }
        }
        System.out.println("names9 -" + queue9); //output [Jaime, Daenerys, Tyrion]

//        Чтобы проделать то же самое с помощью Stream API необходимо воспользоваться другим методом класса Collections - toCollection


        List<String> names0 = Arrays.asList("Jaime", "Daenerys", "", "Tyrion", "");
        Queue<String> queue0 = names.stream()
                .filter(n -> !n.isEmpty())
                .collect(Collectors.toCollection(() -> new LinkedList<>()));
        System.out.println("queue0 -" + queue0); //output [Jaime, Daenerys, Tyrion]

//        Метод toCollection принимает лямбда-выражение типа поставщик (Supplier), которое должно вернуть коллекцию,
//            в которую мы хотим сохранить данные. В данном случае мы вернули LinkedList.
//        Пример так же можно улучшить с помощю ссылки на метод, изменив

        Collectors.toCollection(() -> new LinkedList<>());

//        На                  Java
        Collectors.toCollection(LinkedList::new);
//        Финальный вариант

        List<String> names44 = Arrays.asList("Jaime", "Daenerys", "", "Tyrion", "");
        Queue<String> queue44 = names.stream()
                .filter(n -> !n.isEmpty())
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println("queue44 -" + queue44); //output [Jaime, Daenerys, Tyrion]

    }
}
