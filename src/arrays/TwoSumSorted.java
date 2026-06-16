package arrays;

/**
 * Solution for LeetCode 167: Two Sum II - Input Array Is Sorted.
 * This implementation utilizes the two-pointer technique in opposite directions
 * to find the target sum without requiring additional memory.
 */
public class TwoSumSorted {

    /**
     * Finds two numbers such that they add up to a specific target number.
     * Time Complexity: O(n) - Linear scan moving two pointers inward.
     * Space Complexity: O(1) - Constant extra space used.
     * * @param numbers The input array of integers, already sorted in ascending order.
     * @param target The target sum value.
     * @return An array of two integers representing the 1-based indices of the numbers.
     */
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int currentSum = numbers[left] + numbers[right];

            if (currentSum == target) {
                return new int[]{left + 1, right + 1};
            }
            else if (currentSum > target) {
                right--;
            }
            else {
                left++;
            }
        }

        return new int[]{};
    }
}