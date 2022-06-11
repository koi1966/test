package HashCode;

import java.util.HashSet;
import java.util.Set;

public class Starter {
    public static void main(String[] args) {
        MyClass m1 = new MyClass(11L,"name");
        MyClass m2 = new MyClass(11L,"name");

//        if (m1.equals(m2)){
//            System.out.println("Ok");
//            System.out.println(m1.hashCode());
//            System.out.println(m2.hashCode());
//        }
        Set<MyClass> set = new HashSet<>();

        System.out.println(set.size());
        System.out.println("1");
        set.add(new MyClass(11l,"name"));

        System.out.println("2");
        set.add(new MyClass(11l,"name"));

        System.out.println("3");
        set.add(new MyClass(13l,"name3"));
        System.out.println("4");
        set.add(new MyClass(11l,"name4"));
        System.out.println("Size: " + set.size());
    }
}
