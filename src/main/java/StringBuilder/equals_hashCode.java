package StringBuilder;

public class equals_hashCode {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("Hello");
        StringBuilder stringBuilder2 = new StringBuilder("Hello");

        System.out.println(stringBuilder1.equals(stringBuilder2));
        System.out.println(stringBuilder1 == stringBuilder2);
    }
}
