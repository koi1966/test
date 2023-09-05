public class Sorted {
    public static void main(String[] params) {
        int[] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36,1};
        for (int i : arraySort(array)) {
            System.out.println(i );
        }

        System.out.println(arrayToString(array));

    }

    public static int[] arraySort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;
                }
            }
        }
        return array;
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    private static String moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++ ){
            if (nums[i] != 0){
                nums[index++]=nums[i];
            }
        }
        while (index < nums.length){
            nums[index++] = 0;
        }
        return nums.toString();
    }
}
