public class SobeeExemple {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            String s = i + "";
            char[] charArr = s.toCharArray();
            int sum = 0;
            for (char c: charArr) {
                sum += Integer.parseInt(String.valueOf(c));
            }
            if (sum < 10 && i % 3 == 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }
    }

}
