import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReturnObject {
    int a;

    ReturnObject(int i) {
        a = i;
    }

    ReturnObject incrementByTen() {
        ReturnObject temp = new ReturnObject(a + 10);
        return temp;
    }

    public static void main(String[] args) {
        ReturnObject ob1 = new ReturnObject(2);
        ReturnObject ob2 = ob1.incrementByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        int[] array = {51, 136, 387};

        for (int i : array) {

        }
        System.out.println("****************************************");

        ArrayList list = new ArrayList<>();
        list.add("Вася");
        list.add("Петя");
        list.add("Настя");
        list.add("Саня");
        list.add("Маня");
        System.out.println("До:" + list.toString());

        Collections.sort(list);

        for (Object k : list) {
            System.out.println(k);
        }
        System.out.println("****************************************");
        ArrayList arraylist = new ArrayList();
        arraylist.add(11);
        arraylist.add(2);
        arraylist.add(7);
        arraylist.add(3);
        /* ArrayList before the sorting*/
        System.out.println("Before Sorting:");
        for (Object counter : arraylist) {
            System.out.println(counter);
        }
        /* Sorting of arraylist using Collections.sort*/
        Collections.sort(arraylist);
        /* ArrayList after sorting*/
        System.out.println("After Sorting:");
        for (Object counter : arraylist) {
            System.out.println(counter);
        }
        System.out.println("****************************************");
        ArrayList<String> arraylis = new ArrayList<String>();
        arraylis.add("AA");
        arraylis.add("ZZ");
        arraylis.add("CC");
        arraylis.add("FF");
        /*Unsorted List: ArrayList content before sorting*/
        System.out.println("Before Sorting:");
        for (Object str : arraylis) {
            System.out.println(str);
        }
        /* Sorting in decreasing order*/
        Collections.sort(arraylist, Collections.reverseOrder());
        /* Sorted List in reverse order*/
        System.out.println("ArrayList in descending order:");
        for (Object str : arraylist) {
            System.out.println(str);
        }

        System.out.println("*********************************************");
        boolean[] arr = new boolean[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("****************************************");
        List<String> strings = Arrays.asList("BLOB", "Java is the best", "Java 8", "Java 9", "Jacoco");

//        Optional<String> java = strings.stream()
//                .findAny();

//        Optional<String> java = strings.stream()
//                .filter(s -> s.contains("Java"))
//                .findAny();

        Optional<String> java = strings.parallelStream()
                .filter(s -> s.contains("Java"))
                .findAny();

        System.out.println("java" + java);
        System.out.println("****************************************");

//        Найдем первое число

        List<Integer> numbers = Arrays.asList(1, 5, 8, 10, 12, 15);

        Optional<Integer> first = numbers.stream()
                .findFirst();

        System.out.println("output Optional[1]-"+first); //output Optional[1]

//        Теперь найдем первое число, больше 10
        List<Integer> numbers1 = Arrays.asList(1, 5, 8, 10, 12, 15);

        Optional<Integer> first1 = numbers1.stream()
                .filter(i -> i > 10).map(i -> i + 20)
                .findFirst();

        System.out.println(first1); //output Optional[12]
        System.out.println("****************************************");
//        List<Integer> numbers = Arrays.asList(1, 5, 8, 10, 12, 15);

        Optional<Integer> first2 = numbers.parallelStream()
                .filter(number -> number > 10)
                .findFirst();
        System.out.println(first2); //output Optional[12]

        System.out.println("****************************************");
        System.out.println("*************1, 3, 5, 7,8***************************");
        List<Integer> numbers3 = Arrays.asList(1, 3, 5, 7, 8);

        for (Integer i : numbers3) {
            System.out.println(i * 2); //output 2 6 10 14
        }

        List<Integer> numbers2 = Arrays.asList(1, 3, 5, 7);

        numbers2.stream()
                .map(it -> it * 2)
                .forEach(System.out::println); //output 2 6 10 14


        List<Integer> allow = Arrays.asList(8, 10);
        List<Integer> all = Arrays.asList(1, 5, 10, 12, 15);

        List<Integer> collected = allow.stream().filter(i -> all.stream().anyMatch(n -> n.equals(i))).collect(Collectors.toList());
        System.out.println(collected);

        List<String> intList = Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

        System.out.println(intList);

        List<String> strings1 = Arrays.asList("43213", "312");

    }

}
