package HashCode2;

import java.util.Objects;

public class Mane {

    public static void main(String[] args) {
        Book x = new Book("one");
        Book y = new Book("one");
        Book z = new Book("one");

        System.out.println("reflexive");
        System.out.println(x.equals(x));

        System.out.println(" ");
        System.out.println("symmetriic");
        System.out.println(x.equals(y));
        System.out.println(y.equals(x));
        System.out.println(" ");

        System.out.println("transisive");
        System.out.println(x.equals(y));
        System.out.println(y.equals(z));
        System.out.println(x.equals(z));
        System.out.println(" ");

        System.out.println("consistent");
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));
        System.out.println(" ");

        System.out.println("not null");
        System.out.println(x.equals(null));
    }

    }

    class Book{
        String name;

        public Book(String name) {
            this.name = name;
        }

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            Book book = (Book) o;
//            return Objects.equals(name, book.name);
//        }


        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Book) { // check whether Book is the heir of the Object
                return obj != null && this.name.equals(((Book)obj).name);
            }
            return false;
        }
    }

