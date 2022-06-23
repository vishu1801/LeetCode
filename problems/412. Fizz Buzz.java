class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> str = new ArrayList<String>();
        while(n>0){ 
            if(n%3 == 0 && n%5 == 0)
                str.add("FizzBuzz");
            else if(n%3 == 0)
                str.add("Fizz");
            else if(n%5 == 0)
                str.add("Buzz");
            else
                str.add(String.valueOf(n));
            n--;
        }
        
        Collections.reverse(str);
        
        return str;
    }
}