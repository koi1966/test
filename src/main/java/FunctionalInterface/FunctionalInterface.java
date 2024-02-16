package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * <a href="https://www.youtube.com/watch?v=Czkk1Kgqxjs">...</a>
 */
public class FunctionalInterface {

        public static void main(String[] args) {
            List<String> list = new ArrayList<>(List.of("Hello", "Cat", "Java", "Bag"));
            System.out.println(list);

            list.removeIf(new Predicate<String>() {
                @Override
                public boolean test(String t) {
                    return t.length() > 3;
                }
            });
            System.out.println(list);
        }

}
