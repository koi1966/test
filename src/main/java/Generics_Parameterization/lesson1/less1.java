package Generics_Parameterization.lesson1;

public class less1 {
    public static void main(String[] args) {
        Cell<String> stringCell = new Cell<>();
        stringCell.setT("Oleg");
        String s = stringCell.getT();
        System.out.println("stringCell = " + s);

        Cell<Integer> cellInt = new Cell<>();
        cellInt.setT(4);
        Integer i = cellInt.getT();
        System.out.println("cellInt " + i);

        Set<Double> doubleSet = new Set<>();
        doubleSet.setA(55.0);
        Double d = doubleSet.getA();
        System.out.println("doubleSet " + d);
    }
}

////////// Дженерик тип //////////
class Cell<T> {
    T t;


    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

