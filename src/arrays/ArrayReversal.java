package arrays;

/**
 * Provides solution for reversing an array in-place.
 * This class demonstrates the utilization of the two-pointer technique.
 * * Target: Big Tech Interviews (Google, Nvidia, Amazon, etc.)
 */
public class ArrayReversal {

    /**
     * Reverses the given array of integers in-place.
     * * Time Complexity: O(n) - One pass over half of the array.
     * Space Complexity: O(1) - Constant extra space used for the swap.
     * * @param nums The array of integers to be reversed.
     */
    public void reverseArray(int[] nums) {
        // Edge case: If the array is empty or has only one element, no need to reverse
        if (nums == null || nums.length <= 1) {
            return;
        }

        int left = 0;
        int right = nums.length - 1;

        // Two-pointer approach: Moving towards the center
        while (left < right) {
            // Swap elements using a temporary variable
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            // Move the pointers inward
            left++;
            right--;
        }
    }
}