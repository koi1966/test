import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadiFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
//        String path = "c:" \\rsc1840\\texst.txt";
        String path = "c:" + separator + "rsc1840" + separator + "texst.txt";

        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] nmberString = line.split(" ");
        int[] numbers = new int[3];
        int counter = 0;

        for (String number : nmberString) {
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));

        scanner.close();

        for (int number : numbers) {
            System.out.println(Arrays.toString(numbers));

        }

    }
}
