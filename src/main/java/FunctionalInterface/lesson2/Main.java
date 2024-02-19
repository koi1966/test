package FunctionalInterface.lesson2;

/**
 * <a href="https://www.youtube.com/watch?v=Wc4CIUlfpWg">...</a>
 * https://www.youtube.com/watch?v=glVHgOtHtSk
 * https://www.youtube.com/watch?v=jkqo8Nwqouc
 */
public class Main {
    /**
     * 1 - usage example
     */
    iSum summer = new iSum() {
        @Override
        public int sum(int a, int b) {
            // многострокова логіка в лямді
            // якщо потрібно условіє
            // если есть тело (вигурні скобки то має бути return )
            //
            if ( a == 0) return 0;
            return a + b;
        }
    };
    /**
     * 2 - usage example
     */

    iSum iSum = ((a, b) -> a + b);

    /**
     * 3 - usage example
     */
    iSum iSum3 = (a, b) -> {
        if (a == 0) return 0;
        return a + b;
    };

//    Isqet  isqet = (x) -> Math.sqrt(x);
    Isqet  isqet = x -> Math.sqrt(x);

    Isqet  isqet2= Math::sqrt;
}


