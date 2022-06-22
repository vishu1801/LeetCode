class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int m,l=0,r=nums.length-1;
        
        while(l<=r){
            
            m = l+(r-l)/2;
            
            if(nums[m]==target)
                return m;
            
            if(nums[m] > target){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        
        return r+1;
        
        
        
    }
}