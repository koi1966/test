public class ForR {
    int[] array = {1, 2, 3, 4, 5, 6};

    public void foo() {

        for (int element : array) {
            System.out.println(element);
        }

        for (int i=0;i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
