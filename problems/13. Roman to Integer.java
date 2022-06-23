class Solution {
    public int romanToInt(String s) {
        int i=0,number=0;
        
        while(i<s.length()){
            
            switch(s.charAt(i)){
                    
                case 'I':if( i+1<s.length() && s.charAt(i+1)=='V' ){
                    number+= 4;
                    i++;
                }else if( i+1<s.length() && s.charAt(i+1)=='X'){
                    number+= 9;
                    i++;
                }else{
                    number+= 1;
                }
                    break;
                    
                case 'V': number+= 5;
                    break;
                    
                case 'X': if( i+1<s.length() && s.charAt(i+1)=='L' ){
                    number+= 40;
                    i++;
                }else if( i+1<s.length() && s.charAt(i+1)=='C' ){
                    number+= 90;
                    i++;
                }else{
                    number+= 10;
                }
                    break;
                    
                case 'L': number+= 50;
                    break;
                    
                case 'C': if( i+1<s.length() && s.charAt(i+1)=='M' ){
                    number+= 900;
                    i++;
                }else if( i+1<s.length() && s.charAt(i+1)=='D' ){
                    number+= 400;
                    i++;
                }else{
                    number+= 100;
                }
                    break;
                    
                case 'D': number+= 500;
                    break;
                    
                case 'M': number+= 1000;
                    break;
                    
            }
            
            i++;
        }
        return number;
    }
}