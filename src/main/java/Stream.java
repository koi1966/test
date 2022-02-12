import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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


    }
}
