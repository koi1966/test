package String.String3;

class Super {
    static String ID = "QBANK";
}
class Sub extends Super {
    static {
        System.out.println("In Sub");
    }
}

public class Kod {
    public static void main(String[] args) {
        System.out.println(Sub.ID);
    }
}
