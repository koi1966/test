package Lists;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
//        https://javarush.ru/groups/posts/2203-stream-api
        List<String> listFirst = new ArrayList<>();
        listFirst.add(new String("White"));
        listFirst.add("White");
        listFirst.add("Black");
        listFirst.add("Red");
//        и вторая:
        List<String> listSecond = new ArrayList<>();

        listSecond.add("Green");
        listSecond.add("Red");
        listSecond.add("White");
        listFirst.retainAll(listSecond);
        System.out.println("listFirst" + listFirst);
        System.out.println("listSecond" + listSecond);

        List<String> a = new ArrayList<>();
        a.add("c");
        List<String> b = a.subList(0,1);
        a.add("c");
//        System.out.println(b.size());


    }

}
