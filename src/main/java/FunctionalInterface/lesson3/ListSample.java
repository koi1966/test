package FunctionalInterface.lesson3;

import java.util.ArrayList;
import java.util.List;


/**
 *   https://www.youtube.com/watch?v=jkqo8Nwqouc
 */

public class ListSample {
    public static void main(String[] args) {
        final List<Students> students = new ArrayList<>() {{
            add(new Students("Микола", 36));
            add(new Students("Oleg", 16));
            add(new Students("Сергей", 26));
            add(new Students("ф", 36));
            add(new Students("ии", 36));
            add(new Students("кк", 36));
            add(new Students("сссс", 36));
        }};

        int count = 0;

//        for (Students students1 : students) {
//            // &&  - и
//            // ||  - или
//            if (students1.ege > 30 && (students1.name == null || students1.name.length() <= 4)) {
//                count ++;
//            }
//        }

//        Пример стримами

//        long count1 = students
//                .stream()
//                .filter(students1 -> students1.ege > 30)
//                .map(students1 -> students1.name)
//                .filter(name -> name == null || name.length() <= 4)
//                        .count();

//        или

//        long count1 = students
//                .stream()
//                .filter(students1 -> students1.ege > 30)
////                .map(students1 -> students1.name)
//                .filter(students1 -> students1.name == null || students1.name.length() <= 4)
//                .count();


        long count1 = students
                .stream()
                .filter(students1 -> students1.getEge() > 30)
//                .map(students1 -> students1.getName())
//                или записать так
                .map(Students::getName)
//                в мапе останутся только стринги с именами
                .filter(name ->
                        name == null || name.length() <= 4)
                .count();

        System.out.println(count1);
    }
}
