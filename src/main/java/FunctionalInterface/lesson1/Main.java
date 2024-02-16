package FunctionalInterface.lesson1;

public  class Main {
    public static void main(String[] args) {
        SimpleGen sg = new SimpleGen(5);
        Generator gen1 = sg::getNumber;
        int temp = gen1.getNextElement();
        System.out.println(temp);

        gen1 = SimpleGen::getRandomNumber; // Получение ссылки на статический метод
        temp = gen1.getNextElement();
        System.out.println(temp);
    }
}
