package binarysearch;

/**
 * This implementation demonstrates the classic divide and conquer approach
 * to find a target value in a sorted array.
 */
public class BinarySearch {

    /**
     * Searches for a target value within a sorted array.
     * Time Complexity: O(log n) - The search space is halved in each iteration of the loop.
     * Space Complexity: O(1) - Constant extra space used.
     * * @param nums The input array of integers, sorted in ascending order.
     * @param target The integer value to search for.
     * @return The index of the target if found; otherwise, -1.
     */
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }
}