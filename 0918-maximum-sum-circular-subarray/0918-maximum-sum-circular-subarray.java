class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int currMax = 0;
        int min = nums[0];
        int currMin= 0;
        int totalSum = 0;
        for(int i=0; i<n; i++){
            currMax = Math.max(nums[i], currMax + nums[i]);
            max = Math.max(currMax, max);

            currMin = Math.min(nums[i], currMin + nums[i]);
            min = Math.min(currMin, min);

            totalSum += nums[i];
        }

        if (max < 0) {
            return max;
        }

        return Math.max(max, totalSum-min);
    }
}