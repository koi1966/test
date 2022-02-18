import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


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
    }
}
