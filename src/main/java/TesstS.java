public class TesstS {

    public class TestS {

        static class ClassA{
            int x = 1;

            public void printX()
            {
                System.out.println(getX());
            }
            public int getX() {
                return x;
            }
        }

        static class ClassB extends ClassA {
            int x=2;

            public int getX(){
                return x+2;
            }
        }
        public static void main(String[] args) {
            ClassA a = new ClassB();
            System.out.println(a);

        }
    }




}
