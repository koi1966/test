import java.util.Arrays;
import java.util.List;


public class Stream_2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c", "d", "a", "b");

        strings.stream()
                .distinct()   //Stream distinct() для удаления дубликатов
                .forEach(System.out::println); //output a b c d

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        boolean match = numbers.stream()
                .anyMatch(number -> number % 2 == 0); // есть ли в Stream-e четное число

        System.out.println(match); //output true
        System.out.println("===========================");

        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6,7)
        );
        list.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
