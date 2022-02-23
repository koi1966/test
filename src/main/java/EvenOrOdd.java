import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if (num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
        System.out.println(" ==============================");
//        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num2 = reader.nextInt();

        String evenOdd = (num2 % 2 == 0) ? "even" : "odd";

        System.out.println(num2 + " is " + evenOdd);

        System.out.println(" =======количество вхождений=======================");
        String ss = "блаб лаб лаблаблаллллллллллл";  //
        String pat = "бла"; // что искать
        int curInd = 0; //индекс, с которого следует начать поиск.
        int indPat;

        int counter = 0;
        while ((indPat = ss.indexOf(pat, curInd)) != -1) {
            counter++;
            curInd = indPat + 1;
        }
        System.out.printf("%s - %d", pat, counter);
    }


}
