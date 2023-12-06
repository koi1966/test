package HappyTicketIntensiv;

public class HappyTicket {

    public static void main(String[] args) {
        int totalTickets = 1000000; // Общее количество билетов (от 000000 до 999999)
        int happyTicketsCount = countHappyTickets();

        // Расчет вероятности выпадения счастливого билета
        double probability = (double) happyTicketsCount / totalTickets;

        // Вывод результата
        System.out.println("Вероятность выпадения счастливого билета: " + probability);
    }

    // Метод для подсчета количества счастливых билетов
    public static int countHappyTickets() {
        int count = 0;
        for (int i = 0; i <= 999; i++) {
            for (int j = 0; j <= 999; j++) {
                int ticketNumber = i * 1000 + j;

                // Разделяем номер билета на три цифры слева и три цифры справа
                int leftSum = ticketNumber / 100000 + (ticketNumber / 10000) % 10 + (ticketNumber / 1000) % 10;
                int rightSum = (ticketNumber / 100) % 10 + (ticketNumber / 10) % 10 + ticketNumber % 10;

                // Проверяем, является ли билет счастливым
                if (leftSum == rightSum) {
                    count++;
                }
            }
        }

        return count;
    }

}
