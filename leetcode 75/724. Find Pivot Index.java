class Solution {
    public int pivotIndex(int[] nums) {
        
        int sum_till_now=0;
        
        for(int i=0;i<nums.length;i++){
            
            int sum=0;
            
            for(int j=i+1;j<nums.length;j++)
                sum +=nums[j];
            
            if(sum_till_now == sum){
                return i;
            }else{
                sum_till_now+=nums[i];
            }
        }
        return -1;
    }
}