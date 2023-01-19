package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream3 {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("a", "b", "c", "d", "a", "b");
        System.out.println("Нахождение первого неповторяющегося символа.. ");
        strings.stream()
                .distinct() //Stream distinct() для удаления дубликатов
                .forEach(System.out::println);


        strings.stream().distinct().collect(Collectors.toList());
        System.out.println(strings);

//        ArrayList<String>  id_ = new ArrayList<String>();
        ArrayList<String> listWithoutDuplicates =
                (ArrayList<String>) strings.stream().distinct().collect(Collectors.toList());
        System.out.println("listWithoutDuplicates (без дубликатов): -" + listWithoutDuplicates);

//        Этот метод существует в основном для поддержки отладки, когда вы хотите видеть элементы, когда они проходят через определенную точку в конвейере:

        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
    }

}
