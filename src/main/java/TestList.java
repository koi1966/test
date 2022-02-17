import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {

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

    }
}
