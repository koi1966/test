
    class A {
        int x = 1;

        public void printX() {
            System.out.println(getX());
        }

        public int getX() {
            return x;
        }
    }

    class B extends A {
    int x = 2;

        @Override
        public int getX() {
            return x + 1;
        }
    }

    public class Test {
        public static void main(String[] args) {
            A classA = new B();
            classA.printX();
        }
    }

