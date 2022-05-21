import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lamda {
    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
    integers.forEach(item -> System.out.println(item));

    List<String> colors = Arrays.asList("Black", "White", "Red");
Collections.sort(colors, (o1, o2) -> {
        String o1LastLetter = o1.substring(o1.length() - 1);
        String o2LastLetter = o2.substring(o2.length() - 1);
        return o1LastLetter.compareTo(o2LastLetter);
    });
}
