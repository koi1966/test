package WorkingWithFiles;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class FleRead {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(new FileInputStream("file.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("");
        System.out.println("--DataInputStream dis--");
        byte[] buffer = new byte[512];
        while (dis.available() !=0) {
            int count = dis.read(buffer);
            if (count > 0) {
                System.out.println(new String(buffer));
            }
        }
        System.out.println(" ==Scanner scanner = new Scanner(new FileInputStream(file.txt))==");
        Scanner scanner = new Scanner(new FileInputStream("file.txt"));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        System.out.println(" ======== List =================================");
        List<String> list = Files.readAllLines(Paths.get("file.txt"));
        for (String item : list){
            System.out.println(item);
        }

        System.out.println(" ======== Лямда =================================");
//        Files.lines(Paths.get("file.txt")).forEach(line -> System.out.println(line));
        Files.lines(Paths.get("file.txt")).forEach(System.out::println);
    }
}
