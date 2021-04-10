class Solution {
    public int trailingZeroes(int n) {
       int count = 0;

		// Keep dividing n by powers
		// of 5 and update count
		for (int i = 5; n / i >= 1; i *= 5)
			count += n / i;

		return count;
        
    }  
    
    public static int fact(int n){
         
        if(n==1){
            return 1;
            
        }
        
        int res=n*fact(n-1);
        return res;
    }
}
