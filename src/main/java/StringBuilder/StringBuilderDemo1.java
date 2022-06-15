package StringBuilder;
// https://www.examclouds.com/ru/java/java-core-russian/stringbuilder#header1
//https://developer.alexanderklimov.ru/android/java/stringbuffer.php
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello"); // 5 символв

        System.out.println("string = " + stringBuilder);// string = Hello
        System.out.println("length = " + stringBuilder.length()); //length = 5 - длина объекта
        System.out.println("capacity = " + stringBuilder.capacity()); //capacity = 21
//        Метод позволяет получить текущий объём выделенной памяти.


    }
}
