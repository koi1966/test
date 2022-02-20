public class String_o {
    public static void main(String args[]) {
        String Str = new String("Добро пожаловать на ProgLang.su");
        String SubStr1 = new String("Prog");
        String SubStr2 = new String("Srog");

        System.out.print("Найденный индекс: ");
        System.out.println(Str.indexOf('о'));  // первого вхождения символа
        System.out.print("Найденный индекс: ");
        System.out.println(Str.indexOf('о', 5)); // первого вхождения символа с 6-го символа
        System.out.print("Найденный индекс: ");
        System.out.println(Str.indexOf(SubStr1)); // находится на 20-ом символе
        System.out.print("Найденный индекс: ");
        System.out.println(Str.indexOf(SubStr1, 21));
        System.out.print("Найденный индекс: ");
        System.out.println(Str.indexOf(SubStr2));
    }
}