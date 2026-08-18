class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= nums.length - k; i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }

            for (int n : set) {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }
        }

        int ans = -1;

        for (int n : map.keySet()) {
            if (map.get(n) == 1) {
                ans = Math.max(ans, n);
            }
        }

        return ans;
    }
}