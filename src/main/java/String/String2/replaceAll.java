package String.String2;

public class replaceAll {
    public static void main(String[] args) {

        String java = "Строки являются важной составляющей языка Java";

        // jaba
        String result = java.replaceAll("v", "b");
        System.out.println(result);

        // Строк1
        result = result.replaceAll("и", "1");
        System.out.println(result);

        // важноЙ
        result = result.replaceAll("й", "Й");
        System.out.println(result);

        // Стрки являются важнй сставляющей языка Java
        result = result.replaceAll("о", "");
        System.out.println(result);

        // Джava
        result = result.replaceAll("J", "Дж");
        System.out.println(result);

        String inputString = "Это просто 2016 2014 строка 98765 в 000101 Java 1101001";

        // заменяем все цифры и числа на пустоту
        String result1 = inputString.replaceAll("[0-9]+", "");
        // выведет в консоль 'Это просто   строка  в  Java'
        System.out.println(result1);

        // заменяем все буквы и слова на слово Java
        result = inputString.replaceAll("[a-zA-Z]+", "Java");
        // выведет в консоль 'Java Java 2016   2014 Java 98765 Java 000101 Java 1101001'
        System.out.println(result);
    }
}
