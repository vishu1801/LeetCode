class Solution {
    public String reverseWords(String s) {        
        
        int i=0,j=0;
        String result="";
        
        while(i<s.length()){
            if(s.charAt(i) == ' '){
                int temp=i;
                i--;
                while(i>=j){
                    result = result + s.charAt(i);
                    i--;
                }
                i=temp;
                result += " ";
                j=temp+1;
            }
            i++;
        }
        i--;
        while(i>=j){
            result = result + s.charAt(i);
            i--;
        }
        
        
        return result;
        
    }
}