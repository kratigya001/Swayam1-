class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        // Binary Search
        while (left <= right) {
            int mid = (left + right) / 2;

            // Number of missing numbers till arr[mid]
            // Example: if arr[mid] = 7 and mid=3 -> missing = 7-(3+1)=3
            int missingTillMid = arr[mid] - (mid + 1);

            if (missingTillMid >= k) {
                // kth missing lies on the left side (or at mid)
                right = mid - 1;
            } else {
                // kth missing lies on the right side
                left = mid + 1;
            }
        }

        // Formula: left + k gives kth missing number
        return left + k;
    }
}
