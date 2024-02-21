package String.String1;

import java.util.Calendar;
import java.util.function.Consumer;

//@Slf4j   // Логер
public class StringS {
    public static void main(String[] args) {
        String s1 = "aaa";
        String s2 = "aaa";
        String s3 = new String("aaa");
        String s4 = new String("aaa").intern();
        String s5 = String.valueOf("aaa");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);

        Consumer<Integer> c = StringS::accept;

        Calendar calendar = Calendar.getInstance();
        String[] monthNames = {"Січнь", "Лютий", "Березень", "Квітень", "Травень", "Липень", "Червень", "Серпень", "Вересень", "Жовтень", "Листопад", "Грудень"};
        String month2 = monthNames[calendar.get(Calendar.MONTH)];

        int Integer = 24;
//        char String = "I";
        System.out.print(Integer);
//        System.out.print(String);
//        () -> log
//        log.info("GetMapping(.rubin.week.rubin-week-view)");
//        new String("Hello").intern() == new String("Hello").intern()
    }

    private static void accept(int x) {
        System.out.println(x);
    }
}
