package FunctionalInterface.lesson3;

public class Students {
    final String name;
    final int ege;

    public String getName() {
        return name;
    }

    public int getEge() {
        return ege;
    }

    public Students(String name, int ege) {
        this.name = name;
        this.ege = ege;
    }

}
