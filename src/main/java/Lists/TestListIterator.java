package Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestListIterator {
    public static void main(String[] args) {
// Создаём список массивов
        List<String> listFirst = new ArrayList<>();
        listFirst.add("White");
        listFirst.add("Black");
        listFirst.add("Red");
        listFirst.add("C");
        listFirst.add("A");
        listFirst.add("E");
        listFirst.add("B");
        listFirst.add("D");
        listFirst.add("F");

        // Используем итератор, для отображения элементов al
        System.out.print("Начальное содержание listFirst: ");
        Iterator itr = listFirst.iterator();

        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Изменяем повторяемые объекты
        ListIterator litr = listFirst.listIterator();

        while(litr.hasNext()) {
            Object element = litr.next();
            litr.set(element + "+");
        }
        System.out.print("Изменённое содержание al: ");
        itr = listFirst.iterator();

        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Теперь, отобразим список задом наперёд
        System.out.print("Изменённый список задом наперёд: ");

        while(litr.hasPrevious()) {
            Object element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();

    }

}
