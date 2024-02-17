package FunctionalInterface.lesson2;

/**
 * <a href="https://www.youtube.com/watch?v=Wc4CIUlfpWg">...</a>
 */
public class Main {
    /**
     * 1 - usage example
     */
    iSum summer = new iSum() {
        @Override
        public int sum(int a, int b) {
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
}


