import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        System.out.println("Кофе-машина - Олег К.");
        Scanner in = new Scanner(System.in);
        System.out.print("Скіли у Вас грошей ? ..");
        int moneyAmount = in.nextInt();
//        int moneyAmount = 120;

        int cappucinoPrice = 200;
        int espressoPrice = 100;
        int waterPrice = 50;

        boolean canBuyAnything = false;

        if (moneyAmount >= cappucinoPrice) {
            System.out.println("Вы можете купить капучино");
            canBuyAnything = true;
        }

        if (moneyAmount >= espressoPrice) {
            System.out.println("Вы можете купить эспрессо");
            canBuyAnything = true;
        }

        if (moneyAmount >= waterPrice) {
            System.out.println("Вы можете купить воду");
            canBuyAnything = true;
        }

        if (canBuyAnything == false) {
            System.out.println("Недостаточно средств :( Изучайте Java и зарабатывайте много!))");
        }
    }
}
