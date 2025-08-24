class Solution {
    public int splitArray(int[] nums, int k) {
        // Similar to "Book Allocation Problem"

        // Lower bound = largest element (bcz no subarray sum can be less than max element)
        int low = max(nums);

        // Upper bound = sum of all elements (when only 1 partition is taken)
        int high = sum(nums);

        // Binary search between low and high
        while (low <= high) {
            int mid = (low + high) / 2; // candidate answer (max subarray sum allowed)

            // Count how many subarrays are needed if we fix max sum = mid
            if (helper(nums, mid) <= k) {
                // ✅ Possible to split into <= k subarrays
                // But maybe we can do better → move left
                high = mid - 1;
            } else {
                // ❌ Needs more than k subarrays → mid is too small → move right
                low = mid + 1;
            }
        }

        // After binary search, 'low' will be our answer
        return low;
    }

    // Helper function → count how many subarrays are needed if max allowed sum = mid
    private int helper(int[] nums, int mid) {
        int subarrays = 1; // at least 1 subarray is needed
        int currentSum = 0;

        for (int num : nums) {
            if (currentSum + num <= mid) {
                // still can add this number in current subarray
                currentSum += num;
            } else {
                // start a new subarray
                subarrays++;
                currentSum = num; // reset with current element
            }
        }
        return subarrays;
    }

    // Utility: find max element (for lower bound)
    private int max(int[] arr) {
        int m = Integer.MIN_VALUE;
        for (int num : arr) {
            m = Math.max(m, num);
        }
        return m;
    }

    // Utility: sum of array (for upper bound)
    private int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }
}
