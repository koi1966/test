package Integerr;

public class Intege {
    public static void main(String[] args) {
        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 1000;
        Integer i4 = 1000;

        System.out.println(i1==i2);
        System.out.println(i3 ==i4);
        System.out.println(i1.equals(i2));
        System.out.println(i3.equals(i4));
        System.out.println("========================");


        // безконечный цыкл
        int start = Integer.MAX_VALUE -1;

        for (int i = start; i<= start +1; i++)
        {
            System.out.println(i);
        }
    }
}
