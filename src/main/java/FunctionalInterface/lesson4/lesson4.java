package FunctionalInterface.lesson4;

import java.util.function.Consumer;
import java.util.function.Function;

public class lesson4 {

    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
//        Consumer<String> consumer2 = A::new;
//        Function<A, String> f = new Function<A,String>(){
//            @Override
//            public String apply(A a) {
//                return a.getA();
//            }
//        };

        // верхнее в нижнее - лямду

        Function<A, String> f = A::getA;  // (A) -> String
        f.apply(new A());

    }

    static class A {
        final String a = "olololo";

        public String getA() /* A this - неявний*/ {
            return a;
        }
    }

}

