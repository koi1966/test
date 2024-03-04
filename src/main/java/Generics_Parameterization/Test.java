package Generics_Parameterization;

import java.util.ArrayList;
import java.util.List;


// https://www.youtube.com/watch?v=Er_cj823ZTM
public class Test {

    public static void main(String[] args) {
        ////// java 5 ///////////////
        List animals = new ArrayList();

        List orAnimal = new ArrayList();

        animals.add("cat"); //-"cat"-для List - объект
        animals.add("dog");
        animals.add("frog");
        animals.add("fish");
        animals.add(orAnimal);  // и сюда всунули объект без проблем

        String animal1 = (String) animals.get(2);
        System.out.println(animal1);

        /////////  Generics ///////////
        //  а тут ложить можно только строки

        List<String> animsls2 = new ArrayList<String>();
        animsls2.add("cat");
        animsls2.add("dog");
        animsls2.add("frog");
        animsls2.add("fish");

        String animsls22 = animsls2.get(1);
        System.out.println(animsls22);
    }

    ///////////  java 7 ////////////
    List<String> animsls3 = new ArrayList<>();

//        animsls3.add("cat");
//        animsls3.add("dog");
//        animsls3.add("frog");
//        animsls3.add("fish");
}
