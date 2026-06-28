package binarysearch;

/**
 * This implementation uses binary search to efficiently find the target
 * or its exact insertion index if it is not present in the array.
 */
public class SearchInsertPosition {

    /**
     * Finds the index of the target if found, or the index where it would be inserted.
     * Time Complexity: O(log n) - Halving the search space in each iteration.
     * Space Complexity: O(1) - Constant memory usage.
     *
     * @param nums The sorted array of distinct integers.
     * @param target The target value to search for.
     * @return The target's index or its precise insertion position.
     */
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            // Secure mid-point calculation to prevent integer overflow
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                // Target is greater, discard the left half
                left = mid + 1;
            } else {
                // Target is smaller, discard the right half
                right = mid - 1;
            }
        }

        // Loop terminates when left and right pointers cross (left > right).
        // 'left' naturally points to the correct insertion index.
        return left;
    }
}