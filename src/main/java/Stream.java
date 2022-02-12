import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {

    public static void main(String[] args) {
        List<Integer> numbers2 = Arrays.asList(1, 3, 5, 7);

        numbers2.stream()
                .map(it -> it * 2)
                .forEach(System.out::println); //output 2 6 10 14


        List<Integer> allow = Arrays.asList(8, 10);
        List<Integer> all = Arrays.asList(1, 5, 10, 12, 15);

        List<Integer> collected = allow.stream().filter(i -> all.stream().anyMatch(n -> n.equals(i))).collect(Collectors.toList());
        System.out.println(collected);

        List<String> intList = java.util.stream.Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

        System.out.println(intList);

        List<String> strings1 = Arrays.asList("43213", "312");

//        Найдите следующий пример нахождения квадрата каждого элемента int с использованием Java 8:

        IntStream ints = Arrays.stream(new int[] {1,2,3,4,5});
        List<Integer> intsList = ints.map(x-> x*x)
                .collect(ArrayList<Integer>::new, ArrayList::add, ArrayList::addAll);

//        Для чего их нескольк
        System.out.println(intsList);

//        2. Collect to List + filter Отфильтруем список чисел по четности


            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            List<Integer> evenNumbers = new ArrayList<>(numbers.size());
            for (Integer i : numbers) {
                if (i % 2 == 0) {
                    evenNumbers.add(i);
                }
            }
            System.out.println(evenNumbers); //output [2, 4, 6, 8, 10]



            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            List<Integer> evenNumbers = new ArrayList<>(numbers.size());
            for (Integer i : numbers) {
                if (i % 2 == 0) {
                    evenNumbers.add(i);
                }
            }
            System.out.println(evenNumbers); //output [2, 4, 6, 8, 10]

//        Теперь мы можем использовать методы filter и collect


            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            List<Integer> evenNumbers = numbers.stream()
                    .filter(i -> i % 2 == 0)
                    .collect(Collectors.toList());

            System.out.println(evenNumbers); //output [2, 4, 6, 8, 10]


        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            List<Integer> evenNumbers = numbers.stream()
                    .filter(i -> i % 2 == 0)
                    .collect(Collectors.toList());

            System.out.println(evenNumbers); //output [2, 4, 6, 8, 10]
        }
//        К счастью, свой коллектор нам писать не нужно т.к. в Java 8 добавили утилитный класс Collectors с необходимыми методами.
//        Collect в сочетании с Collectors.toList возвращают List  (реализация - ArrayList)

//        3. Collect to Set + map Преобразуем список имен в набор(Set) имен в верхнем регистре


            List<String> names = Arrays.asList("John", "Arya", "Sansa");
            Set<String> upperCaseNames = new HashSet<>();

            for (String name : names) {
                upperCaseNames.add(name.toUpperCase());
            }
            System.out.println(upperCaseNames); //output [ARYA, JOHN, SANSA]



            List<String> names = Arrays.asList("John", "Arya", "Sansa");
            Set<String> upperCaseNames = new HashSet<>();

            for (String name : names) {
                upperCaseNames.add(name.toUpperCase());
            }
            System.out.println(upperCaseNames); //output [ARYA, JOHN, SANSA]

//        Сейчас же мы можем воспользоваться методом map со ссылкой на метод, а так же утилитным классом Collectors


            List<String> names = Arrays.asList("John", "Arya", "Sansa");
            Set<String> upperCaseNames = names.stream()
                    .map(String::toUpperCase)
                    .collect(Collectors.toSet());

            System.out.println(upperCaseNames); //output [ARYA, JOHN, SANSA]



            List<String> names = Arrays.asList("John", "Arya", "Sansa");
            Set<String> upperCaseNames = names.stream()
                    .map(String::toUpperCase)
                    .collect(Collectors.toSet());

            System.out.println(upperCaseNames); //output [ARYA, JOHN, SANSA]

//        Collect в сочетании с Collectors.toSet возвращают Set (реализация -  HashSet)

//        4. Collect to Collection  Соберем список не пустых строк в Queue

            List<String> names = Arrays.asList("Jaime", "Daenerys", "", "Tyrion", "");
            Queue<String> queue = new LinkedList<>();
            for (String name : names) {
                if (!name.isEmpty()) {
                    queue.add(name);
                }
            }
            System.out.println(queue); //output [Jaime, Daenerys, Tyrion]


            List<String> names = Arrays.asList("Jaime", "Daenerys", "", "Tyrion", "");
            Queue<String> queue = new LinkedList<>();
            for (String name : names) {
                if (!name.isEmpty()) {
                    queue.add(name);
                }
            }
            System.out.println(queue); //output [Jaime, Daenerys, Tyrion]

//        Чтобы проделать то же самое с помощью Stream API необходимо воспользоваться другим методом класса Collections - toCollection


            List<String> names = Arrays.asList("Jaime", "Daenerys", "", "Tyrion", "");
            Queue<String> queue = names.stream()
                    .filter(n -> !n.isEmpty())
                    .collect(Collectors.toCollection(() -> new LinkedList<>()));
            System.out.println(queue); //output [Jaime, Daenerys, Tyrion]



            List<String> names = Arrays.asList("Jaime", "Daenerys", "", "Tyrion", "");
            Queue<String> queue = names.stream()
                    .filter(n -> !n.isEmpty())
                    .collect(Collectors.toCollection(() -> new LinkedList<>()));
            System.out.println(queue); //output [Jaime, Daenerys, Tyrion]

//        Метод toCollection принимает лямбда-выражение типа поставщик (Supplier), которое должно вернуть коллекцию, в которую мы хотим сохранить данные. В данном случае мы вернули LinkedList.

//        Пример так же можно улучшить с помощю ссылки на метод, изменив

        Collectors.toCollection(() -> new LinkedList<>())

        Collectors.toCollection(() -> new LinkedList<>())

//        На                  Java
        Collectors.toCollection(LinkedList::new)

        Collectors.toCollection(LinkedList::new)
//        Финальный вариант



            List<String> names = Arrays.asList("Jaime", "Daenerys", "", "Tyrion", "");
            Queue<String> queue = names.stream()
                    .filter(n -> !n.isEmpty())
                    .collect(Collectors.toCollection(LinkedList::new));
            System.out.println(queue); //output [Jaime, Daenerys, Tyrion]


            List<String> names = Arrays.asList("Jaime", "Daenerys", "", "Tyrion", "");
            Queue<String> queue = names.stream()
                    .filter(n -> !n.isEmpty())
                    .collect(Collectors.toCollection(LinkedList::new));
            System.out.println(queue); //output [Jaime, Daenerys, Tyrion]

    }
}
