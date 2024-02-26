import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // Create a map to store the indices of elements
        Map<Integer, Integer> numIndices = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement needed to reach the target
            int complement = target - nums[i];

            // Check if the complement is already in the map
            if (numIndices.containsKey(complement)) {
                // If found, return the indices of the two numbers
                return new int[]{numIndices.get(complement), i};
            }

            // If not found, store the index of the current number in the map
            numIndices.put(nums[i], i);
        }

        // If no solution is found, return an empty array or handle it as needed
        return new int[]{};
    }

    public static void main(String[] args) {
        // Example usage:
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);

        // Print the result
        for (int index : result) {
            System.out.print(index + " ");
        }


        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");

        Set<Integer> keys = passportsAndNames.keySet();
        System.out.println("Ключи: " + keys);

        ArrayList<String> values = new ArrayList<>(passportsAndNames.values());
        System.out.println("Значения: " + values);
    }
}
