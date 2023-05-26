package LogicalOperator;
public class LogicalOperator {

    public static void main(String[] args) {
        //    Оператор "&&" (логическое И):
        //    Этот оператор возвращает true, если оба операнда являются true, и false в противном случае.
        boolean a = true;
        boolean b = false;
        boolean result = a && b;
        System.out.println(result);  // Вывод: false

//        Оператор "||" (логическое ИЛИ):
//        Этот оператор возвращает true, если хотя бы один из операндов является true, и false,
//        если оба операнда равны false.
        boolean a1 = true;
        boolean b1 = false;
        boolean result1 = a1 || b1;
        System.out.println(result1);  // Вывод: true

//        Оператор "!" (логическое НЕ):
//        Этот оператор инвертирует значение операнда. Если операнд равен true, то результат будет false, и наоборот.
        boolean a2 = true;
        boolean result2 = !a2;
        System.out.println(result2);  // Вывод: false

//        Оператор "==" (равенство):
//        Этот оператор сравнивает два операнда и возвращает true, если они равны, и false, если они не равны.

//                Оператор "==" (равенство):
//        Этот оператор сравнивает два операнда и возвращает true, если они равны, и false, если они не равны.
        int a3 = 5;
        int b3 = 5;
        boolean result3 = (a3 == b3);
        System.out.println(result3);  // Вывод: true


//        Оператор "!=" (неравенство):
//        Этот оператор сравнивает два операнда и возвращает true, если они не равны, и false, если они равны.

        int a4 = 5;
        int b4 = 7;
        boolean result4 = (a4 != b4);
        System.out.println(result4);  // Вывод: true

    }


}
