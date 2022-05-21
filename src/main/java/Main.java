import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Кофе-машина");

        Scanner in = new Scanner(System.in);
        System.out.print("Cкільки у Вас грошей ? .. ");
        int moneyAmount = in.nextInt();
//        int moneyAmount = 120;

        int[] drinkPrices = {200, 100, 50, 40};
        String[] drinkNames = {"капучіно", "эспрессо", "вода"};

        boolean canBuyAnything = false;

        int length = Math.min(drinkPrices.length, drinkNames.length);

        for (int i = 0; i < length; i++) {
            if (moneyAmount >= drinkPrices[i]) {
                System.out.println("За ці гроші тільки " +
                        drinkNames[i]);
                canBuyAnything = true;
            }
        }

        if (!canBuyAnything) {
            System.out.println("Недостаточно средств :( Изучайте Java и зарабатывайте много!");
        }
    }
}
