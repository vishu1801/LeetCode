class Solution {
    public void reverseString(char[] s) {
        
        int i=0, j=s.length-1;
        
        while(i<j){
            // s[i] += s[j];
            // s[j] = s[i] - s[j];
            // s[i] -= s[j];
            
            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;
            
            i++;j--;
        }
        
    }
}