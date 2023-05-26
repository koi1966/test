import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lamda {
    public static void main(String[] args) {
        List<Integer> integ = Arrays.asList(1, 3, 5, 7, 9);
        // Из листа в массив
        int[] primitive = integ.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println("Arrays.toString(primitive)");
        System.out.println(Arrays.toString(primitive));
        System.out.println("________");
        List<String> list = Arrays.asList(
                "Франция", "Германия", "Монако", "Испания", "Италия",
                "Австрия", "Испания", "Монако", "Грузия", "Монако",
                "Испания", "Италия", "Україна","Монако", "Сингапур", "Армения");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Sorted List : "+list);
        System.out.println(list);

//    integers.forEach(item -> System.out.println(item));

//    List<String> colors = Arrays.asList("Black", "White", "Red");
//Collections.sort(colors, (o1, o2) -> {
//        String o1LastLetter = o1.substring(o1.length() - 1);
//        String o2LastLetter = o2.substring(o2.length() - 1);
//        return o1LastLetter.compareTo(o2LastLetter);
//    });
    }
}
