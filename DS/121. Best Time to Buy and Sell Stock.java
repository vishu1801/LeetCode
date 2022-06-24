class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1){
            return 0;
        }
        
        int i = 0, buy=99999,sell=0;
        
        while(i<prices.length){
            
            buy = Math.min(buy,prices[i]);
            sell = Math.max(sell, prices[i]-buy);
            i++;
            
        }

        
        return sell;
        
    }
}