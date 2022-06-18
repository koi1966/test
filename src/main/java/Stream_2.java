import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Stream_2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c", "d", "a", "b");
        System.out.print("удалениe дубликатов.. ");
        strings.stream()
                .distinct()   //Stream distinct() для удаления дубликатов
                .forEach(System.out::println); //output a b c d

        System.out.println("===========================");
        System.out.print("четные числа.. ");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        boolean match = numbers.stream()
                .anyMatch(number -> number % 2 == 0); // есть ли в Stream-e четное число

        System.out.println(match); //output true
        System.out.println("===========================");

        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6, 7, 7, 6, 3, 2, 1)
        );

        list.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);

        Stream.of("10", "11")
                .map(x -> Integer.parseInt(x, 18))
                .forEach(System.out::println);
    }



}
