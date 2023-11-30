public class LogicalOperatorsExample {
    public static void main(String[] args) {
        // Пример с логическими операторами AND, OR, NOT

        // Логический оператор AND (&&)
        int age = 17;
        boolean isStudent = true;

        if (age > 18 && isStudent) {
            System.out.println("Вы взрослый студент.");
        } else {
            System.out.println("Вы не взрослый студент.");
        }

        // Логический оператор OR (||)
        boolean isEmployee = false;

        if (isStudent || isEmployee) {
            System.out.println("Вы студент или работник.");
        } else {
            System.out.println("Вы не студент и не работник.");
        }

        // Логический оператор NOT (!)
        boolean isLoggedIn = false;

        if (!isLoggedIn) {
            System.out.println("Вы не вошли в систему.");
        } else {
            System.out.println("Вы вошли в систему.");
        }
    }
}
