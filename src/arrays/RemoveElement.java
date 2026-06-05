package arrays;

/**
 * Solution for LeetCode 27: Remove Element.
 * This implementation utilizes the two-pointer technique (Read and Write pointers)
 * to perform an in-place modification of the array.
 * * Target: Big Tech Interviews (Google, Nvidia, Amazon, etc.)
 */
public class RemoveElement {

    /**
     * Removes all occurrences of a specific value in-place and returns the new length.
     * * Time Complexity: O(n) - We traverse the array of size n exactly once.
     * Space Complexity: O(1) - Constant extra space, modifying the array in-place.
     * * @param nums The input array of integers.
     * @param val The target value to be removed from the array.
     * @return The number of elements remaining in the array that are not equal to val.
     */
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int writePointer = 0;

        // Iterate through the array using the read pointer
        for (int readPointer = 0; readPointer < nums.length; readPointer++) {
            // If the current element is a valid number (not equal to val), write it down
            if (nums[readPointer] != val) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            }
        }

        // The writePointer naturally tracks the total count of remaining elements
        return writePointer;
    }
}