package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//  https://www.youtube.com/watch?v=4PWfSmgiHKs
public class Stream2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c", "d", "a", "b");
        System.out.println("удалениe дубликатов.. ");
        strings.stream()
                .distinct()   //Stream distinct() для удаления дубликатов
                .forEach(System.out::println); //output a b c d
//        List<String> collected = streamList.filter(x -> x.length() != 3).collect(Collectors.toList());
        List<String> collected = strings.stream().distinct().toList();
        System.out.println( "вывод -удалениe дубликатов собрали в колекцию"+
                collected
        );
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

        list.stream()
                .flatMap(List::stream)
                        .collect(Collectors.toList());

        System.out.println();

        Stream.of("10", "11")
                .map(x -> Integer.parseInt(x, 18))
                .forEach(System.out::println);
    }


}
