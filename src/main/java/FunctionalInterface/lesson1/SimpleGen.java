package FunctionalInterface.lesson1;

public class SimpleGen {
    private int number;
    public SimpleGen(int number) {
        super();
        this.number = number;
    }
    public SimpleGen() {
        super();
    }
    public int getNumber() {
        int temp = number;
        number = number + 1;
        return temp;
    }

    /**
     * Статический метод с подходящим типом возвращаемого
     * значения и списком параметров
     * @return
     */
    public static int getRandomNumber() {
        return (int) (Math.random() * 10);
    }
}
