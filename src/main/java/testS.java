import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class testS {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        int year = today.get(ChronoField.YEAR);
        int month = today.get(ChronoField.MONTH_OF_YEAR);
        int dayYear = today.get(ChronoField.DAY_OF_YEAR);
        int dayMonth = today.get(ChronoField.DAY_OF_MONTH);
        int dayWeek = today.get(ChronoField.DAY_OF_WEEK);

        System.out.println("Год: " + year);
        System.out.println("Месяц: " + month);
        System.out.println("День в году: " + dayYear);
        System.out.println("День месяца: " + dayMonth);
        System.out.println("День недели: " + dayWeek);


        String date = "2017-03-15";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date myNewDate = dateFormat.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("****************************************");
        Calendar cal = Calendar.getInstance();
        String month1 = new SimpleDateFormat("MMMM", new Locale("ua")).format(cal.getTime());

        System.out.println("*********Calendar calendar = Calendar.getInstance();*******************************");
        Calendar calendar = Calendar.getInstance();
        String[] monthNames = {"Січня", "Лютого", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        String month2 = monthNames[calendar.get(Calendar.MONTH)];
        System.out.println(month2);
        System.out.println("****************************************");

        Calendar calendar2 = Calendar.getInstance();
        String[] monthNames2 = {"Січнь", "Лютийй", "Березень", "Квітень", "Травень", "Липень", "Червень", "Серпень", "Вересень", "Жовтень", "Листопад", "Грудень"};
        String month3 = monthNames2[calendar2.get(Calendar.MONTH)];
        System.out.println(month3);

        System.out.println("****************************************");

        ArrayList<String> list;
        list = new ArrayList<String>();
        list.add("Школа  world");
        list.add("Яблоко");
        list.add("Груша");
        list.add("Слива");
        list.set(1, "Персик");
//        list.sort();
        System.out.println(
                "2-ой элемент массива '" + list.get(1) + "'");
        System.out.println("Первый элемент массива '"
                + list.get(0) + "'");
        System.out.println("Размер массива '"
                + Integer.valueOf(list.size()) + "'");
        int index = list.indexOf("Слива");

// выводим имя элемента и его номер в массиве
        System.out.println(list.get(index) +
                " числится под номером " + index);
        System.out.println(list.contains("Картошка") + "");
        System.out.println(list.contains("Груша") + "");
//        Создание массива из элементов ArrayList, метод toArray
        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("Київ");
        myArrayList.add("Польша");
        myArrayList.add("Греция");
        myArrayList.add("Чехия");
        myArrayList.add(1, "Paris");
        String[] array = {}; // конвертируем ArrayList в массив
        array = myArrayList.toArray(new String[myArrayList.size()]);
        System.out.println(array[3]);


//  Array
        String[] deliveryCities = {"Chicago", "New York", "Toronto", "Paris"}; // создали масив
        String[] deliveryCities2 = new String[deliveryCities.length + 1];  // создали второй масив
        for (int i = 0; i < deliveryCities.length; i++) {
            deliveryCities2[i] = deliveryCities[i];  // из первого масива переписать все в второй
        }
        deliveryCities2[deliveryCities.length] = "London"; // Добавим одну запись в масив

        Calendar calendar3 = Calendar.getInstance();
        String[] monthNames3 = {"Січнь", "Лютийй", "Березень", "Квітень", "Травень", "Липень", "Червень", "Серпень", "Вересень", "Жовтень", "Листопад", "Грудень"};
        String month4 = monthNames3[calendar3.get(Calendar.MONTH)];
        System.out.println(month4);
    }
}