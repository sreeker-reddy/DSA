// Last updated: 3/26/2026, 1:48:14 AM
public class Solution {
    public int KthFactor(int n, int k) {
        /* Solution 1:
         For i=1 to n 
            if (n%i == 0) then count++
            if (count == k) return i;
         Return -1;
        */

        /* Solution 2 to solve this problem with less than O(n) complexity = square n
        
        */       
    for(int i= 1; i < Math.Sqrt(n); i++){
        if(n % i == 0 && --k ==0) return i;
    }
	for(int i= (int)Math.Sqrt(n); i>=1; i--){
        if(n % (n / i) == 0 && --k ==0) return n/i;
    }	
    return -1; 
    }
}