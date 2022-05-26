import java.util.Arrays;
import java.util.Random;

public class RandomR {
    public static void main(String[] args) {
        int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] values = new int[10];
        int temp = 0;
        for (int i = 0; i < (values.length); i++) {
            Random rand = new Random();
            int randIndex = rand.nextInt(10);
            temp = values[randIndex];
            values[i] = values[values.length - randIndex - 1];
            values[values.length - randIndex - 1] = temp;
        }

        String arrayToString = Arrays.toString(values);
        System.out.println(arrayToString);

        int x = 0;
        x = (-5) + (+15); //Скобки для наглядности, можно и без них
        System.out.println("x = " + x);
        int y = -x;
        System.out.println("y = " + y);
    }


}



