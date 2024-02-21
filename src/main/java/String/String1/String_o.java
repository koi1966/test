package String.String1;

public class String_o {
    public static void main(String args[]) {
        String Str = new String("Доброоооо пожаловать на ProgLang.su");
        String SubStr1 = new String("Prog");
        String SubStr2 = new String("Srog");

        System.out.print("Найденный индекс: ");
        System.out.println(Str.indexOf("о"));  // первого вхождения символа
        System.out.print("Найденный индекс: ");
        System.out.println(Str.indexOf("о", 5)); // первого вхождения символа с 6-го символа
        System.out.print("Найденный индекс: ");
        System.out.println(Str.indexOf(SubStr1)); // находится на 20-ом символе
        System.out.print("Найденный индекс: ");
        System.out.println(Str.indexOf(SubStr1, 21));
        System.out.print("Найденный индекс: ");
        System.out.println(Str.indexOf(SubStr2));

        int a = 0;
        int b ;
        for (int i = 0; i < Str.length(); i++) {
            if ((b = Str.indexOf("о", i)) != -1) {
                i = b;
              a++;
           }
        } System.out.println("Букв - о переменной ( Str ) =" + a);

        byte[] aa={49,50,51,52,53,54,55};
        String bb=new String(aa);
        System.out.println(bb);

        String c = new String(aa,2,4);
        System.out.println(c);
    }
}