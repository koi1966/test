package String1;
public class StringRevers {

    public static String reverseWord(String word) {
        char[] charactors = word.toCharArray();
        int left = 0;
        int right = charactors.length - 1;

        while (left < right) {
            char temp = charactors[left];
            charactors[left] = charactors[right];
            charactors[right] = temp;

            left++;
            right--;
        }
            return new String(charactors);
    }

    public static void main (String[] args){
            String word = "Hello World";
            String reverseWord = reverseWord(word);
            System.out.println("Слово: " +word);
            System.out.println("Результат: " +reverseWord);
    }
 }
