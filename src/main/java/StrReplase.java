public class StrReplase {
    public static void main(String[] args) {
// Добавим цифр, чтобы было что заменять.
        String s = "abc123abc+0abc123+123";

        //Находим индекс первого фхождения символа "+".
        int p = s.indexOf("+");

        String result;
        if (p == -1) {
            //Если симвоол "+" не найден в строке, то результатом будет исходная
            //строка
            result = s;
        } else {
            //Если символ "+" найден,
            //результат склеиваем из двух частей.
            //Первая - до первого вхождения символа с заменёнными на "-" цифрами.
            //Вторая часть - после плюса и без изменений.
            result = s.substring(0, p).replaceAll("[0-9]", "-")
                    + s.substring(p);
        }
        System.out.println(result);

        String testString = "am  aa mkk j hatapa";
        System.out.println(testString.replaceAll("(?<! ) (?! )", "_"));
    }
}
