package ForEach;

import java.util.ArrayList;

public class f {
    public static void main(String[] args) {
        int[] array = {51,136, 387};
        System.out.println(" Пример 1 ");
        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }

        System.out.println(" Пример 2 ");
        for (int i:array) {
            System.out.println(i);
        }


        System.out.println(" Пример 3 ");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(51);
        list.add(136);
        list.add(387);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        System.out.println(" Пример 4 ");
        for (Integer i:list) {
            System.out.println(i);
        }
    }

}
