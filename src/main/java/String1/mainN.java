package String1;

public class mainN {

    public static void main(String[] args) {
        StringInt stringInt = new StringInt();
        System.out.println(stringInt.calculateFromString("2+3*2"));


        System.out.println("================");
        int a = 10;
        int b = 5;
        System.out.println(a + ' ' + b);
        System.out.println(a + ' ' );
        System.out.println( ' ' + b);

        System.out.println("================");
        int a1 = 10;
        int b1 = a1;
        a1 = 20;
        System.out.println(a1++ + ++b1);
        System.out.println(a1++);
        System.out.println(++b1);
        System.out.println(++b1);


    }
}
