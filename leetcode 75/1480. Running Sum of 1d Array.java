class Solution {
    public int[] runningSum(int[] nums) {
        
        int sum_till=0;
        
        for(int i=0;i<nums.length;i++){
            sum_till += nums[i];
            nums[i] = sum_till;
        }
        return nums;
        
    }
}