import java.util.*;

import static com.sun.tools.attach.VirtualMachine.list;

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
        System.out.println("До:" + list());

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

        System.out.println("output Optional[1]-" + first); //output Optional[1]

//        Теперь найдем первое число, больше 10
        List<Integer> numbers1 = Arrays.asList(1, 5, 8, 10, 12, 15);

        Optional<Integer> first1 = numbers1.stream()
                .filter(number -> number > 10)
                .findFirst();

        System.out.println(first1); //output Optional[12]

//        List<Integer> numbers = Arrays.asList(1, 5, 8, 10, 12, 15);
        Optional<Integer> first2 = numbers.parallelStream()
                .filter(number -> number > 10)
                .findFirst();
        System.out.println(first2); //output Optional[12]
    }

}
