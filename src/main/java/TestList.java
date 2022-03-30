import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
//        https://javarush.ru/groups/posts/2203-stream-api
        List<String> listFirst = new ArrayList<>();
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

        ArrayList list1 =new ArrayList<>();
    }

}
