public class LogicalOperatorsExample {
    public static void main(String[] args) {
        // ������ � ����������� ����������� AND, OR, NOT

        // ���������� �������� AND (&&)
        int age = 17;
        boolean isStudent = true;

        if (age > 18 && isStudent) {
            System.out.println("�� �������� �������.");
        } else {
            System.out.println("�� �� �������� �������.");
        }

        // ���������� �������� OR (||)
        boolean isEmployee = false;

        if (isStudent || isEmployee) {
            System.out.println("�� ������� ��� ��������.");
        } else {
            System.out.println("�� �� ������� � �� ��������.");
        }

        // ���������� �������� NOT (!)
        boolean isLoggedIn = false;

        if (!isLoggedIn) {
            System.out.println("�� �� ����� � �������.");
        } else {
            System.out.println("�� ����� � �������.");
        }
    }
}
