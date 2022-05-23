public class Main {

    public static void main(String[] args) {
        System.out.println("Кофе-машина");

        int moneyAmount = 120;

        int[] drinkPrices = {200, 100, 50, 40};
        String[] drinkNames = {"капучино", "эспрессо", "воду"};

        boolean canBuyAnything = false;

        int length = Math.min(drinkPrices.length, drinkNames.length);

        for (int i = 0; i < length; i++) {
            if (moneyAmount >= drinkPrices[i]) {
                System.out.println("Вы можете купить " +
                        drinkNames[i]);
                canBuyAnything = true;
            }
        }

        if (!canBuyAnything) {
            System.out.println("Недостаточно средств :( Изучайте Java и зарабатывайте много!");
        }
    }
}