public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n==1)
            return 1;
        int l=1,m,r=n;
        while(l<=r){
            m = l+(r-l)/2;
            
            if(isBadVersion(m)){
                
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return l;
        
    }
}