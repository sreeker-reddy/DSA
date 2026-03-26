// Last updated: 3/26/2026, 1:47:41 AM
public class Solution {
    static long Mod = 1000000007;
    public int CountGoodNumbers(long n) {

        //the question is very simple based on n value we want to find the permutation and the combination

        long even = (n+1)/2;
        long odd = n/2;

        //to check for even permutation 5 [0,2,4,6,8]
        long first = findPow(5,even);
        //to check for odd permutation 4 [2,3,5,7]
        long second = findPow(4,odd);

        long final = (first*second)%Mod;

        return (int)final;
        
    }
    //finding the power with O(logn) complexity.
    static long findPow(int x,long n)
    {
        //base case
        if(n==0)
        {
            return 1;
        }
        //explore
        long temp = findPow(x,n/2);

        if(n%2==0)
        {
            return (temp*temp)%Mod;
        }
        else
        {
            return (x*temp*temp)%Mod;
        }
    }
}