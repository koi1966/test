import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

public class StreamAPI {
    public static void main(String[] args) {

//        https://javarush.ru/groups/posts/2203-stream-api


        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");
        Stream<String> stream = list.stream();
        stream.filter(x-> x.length() == 3).forEach(System.out::println);
//        1 — создаём список list;
//        2-11 — заполняем его тестовыми данными;
//        12 — создаём обьект Stream;
//        13 — метод filter (фильтр) — промежуточный оператор, x приравнивается к одному элементу коллекции для перебора (как при for each) и после -> мы указываем как фильтруется наша коллекция и так как это промежуточный оператор, отфильтрованная коллекция идёт дальше в метод forEach который в свою очередь является терминальным (конечным) аналогом перебора for each (Выражение System.out::println сокращенно от: x-> System.out.println(x)), которое в свою очередь проходит по всем элементам переданной ему коллекции и выводит её)

        IntStream.of(50, 60, 70, 80, 90, 100, 110, 120)
                .filter(x -> x < 90)
                .map(x -> x + 10)
                .limit(5).forEach(System.out::println);

        Map<Boolean, List<String>> map1 = Stream.of(
                        "ab", "c", "def", "gh", "ijk", "l", "mnop")
                .collect(Collectors.partitioningBy(s -> s.length() <= 2));
        map1.entrySet().forEach(System.out::println);

        List<String> strings = map1.get(true);
        System.out.println(strings);

        List<String> mapStr = Stream.of(
                        "ab", "c", "def", "gh", "ijk", "l", "mnop")
                .filter(s -> s.length() <= 2)
                .collect(Collectors.toList());
        System.out.println(" вывод на  <= 2 -" + mapStr);

        String[] array = {"Java", "Ruuuuussshhh"};
        Stream<String> streamOfArray = Arrays.stream(array);
        streamOfArray.map(s->s.split("")) //Преобразование слова в массив букв
                .flatMap(Arrays::stream).distinct() //выравнивает каждый сгенерированный поток в один поток
                .collect(Collectors.toList()).forEach(System.out::println);

        String[] array2 = {"Java2", "Ruuuuussshhh2"};
        Stream<String> streamOfArray2 = Arrays.stream(array2);
        streamOfArray2.map(s->s.split("")) //Преобразование слова в массив букв
                .map(Arrays::stream).distinct() //Сделать массив в отдельный поток
                .collect(Collectors.toList()).forEach(System.out::println);


    }
}

