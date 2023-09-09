package String1;

public class StringA {
    public static void main(String[] args) {

        System.out.println("abc");
        String cde = "cde";
        System.out.println("abc" + cde);
        String c = "abc".substring(2, 3);
        String d = cde.substring(1, 2);

        System.out.println(c);
        System.out.println(d);

        "hamburger".substring(4, 8);// returns "urge"
        "smiles".substring(1, 5); // returns "mile"

        System.out.println("hamburger".substring(4, 8));
        System.out.println("smiles".substring(0, 3));
    }
}
