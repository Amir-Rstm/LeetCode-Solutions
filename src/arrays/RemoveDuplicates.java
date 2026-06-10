package arrays;

/**
 * Solution for LeetCode 26: Remove Duplicates from Sorted Array.
 * This implementation utilizes the two-pointer approach (Zwei-Zeiger-Ansatz)
 * to filter out duplicate elements in-place.
 * * Target: Big Tech Interviews (Google, Nvidia, Amazon, etc.)
 */
public class RemoveDuplicates {

    /**
     * Removes duplicates from a sorted array in-place.
     * * Time Complexity: O(n) - Linear scan where n is the length of the array.
     * Space Complexity: O(1) - Constant extra space used (In-place modification).
     * * @param nums The sorted input array of integers.
     * @return The number of unique elements inside the array.
     */
    public int removeDuplicates(int[] nums) {
        // Edge case: If the array is empty, return 0 immediately
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // The write pointer tracks where the next unique element should be placed
        int writePointer = 1;

        // The read pointer scans the array to discover new unique elements
        for (int readPointer = 1; readPointer < nums.length; readPointer++) {
            // If a new unique element is discovered
            if (nums[readPointer] != nums[readPointer - 1]) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            }
        }

        // The position of writePointer naturally represents the count of unique elements
        return writePointer;
    }
}