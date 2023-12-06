public class FibonacciCalculator {
    public static void main(String[] args) {
        int n = 10; // Replace 10 with the desired Fibonacci number you want to calculate

        System.out.println("Fibonacci number at position " + n + " is: " + calculateFibonacci(n));
        System.out.println("Fibonacci number at position 0 is: " + calculateFibonacci(0));
        System.out.println("Fibonacci number at position 5 is: " + calculateFibonacci(5));
        System.out.println("Fibonacci number at position 10 is: " + calculateFibonacci(10));
        System.out.println("Fibonacci number at position 15 is: " + calculateFibonacci(15));
        System.out.println("Fibonacci number at position 19 is: " + calculateFibonacci(19));
        System.out.println("Fibonacci number at position 20 is: " + calculateFibonacci(20));
        System.out.println("Fibonacci number at position 21 is: " + calculateFibonacci(21));
    }

    // Recursive method to calculate Fibonacci numbers
    public static int calculateFibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: Fibonacci of 0 and 1 is the number itself
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }
}
