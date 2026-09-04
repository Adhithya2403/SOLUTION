class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] right = new int[n];

        right[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.min(nums[i], right[i + 1]);
        }
        int leftMax = 0;

        for (int i = 0; i < n; i++) {

            leftMax = Math.max(leftMax, nums[i]);

            int instability = leftMax - right[i];

            if (instability <= k) {
                return i;
            }
        }

        return -1;
    }
}