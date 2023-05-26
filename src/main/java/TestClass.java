class OuterClass {
    private static String secret = "secret string";

    //Объявление вложенного класса
    public static class InnerStaticClass {
        static void printString(String str) {
            System.out.println(str);
        }

        void printReverseString(String str) {
            StringBuilder sb = new StringBuilder(str);
            System.out.println(sb.reverse());
        }

        static void printSecret() {
            System.out.println(secret);
        }
    }
}

public class TestClass {
    public static void main(String[] args) {
        String string = "Мама мыла раму";
//Вызов методов вложенного класса
        OuterClass.InnerStaticClass.printString(string);
//Создание экземпляра вложенного класса
        OuterClass.InnerStaticClass inClass = new OuterClass.InnerStaticClass();
        inClass.printReverseString(string);
//Обращение к приватным полям внешнего класса через метод внутреннего класса
        OuterClass.InnerStaticClass.printSecret();
    }
}