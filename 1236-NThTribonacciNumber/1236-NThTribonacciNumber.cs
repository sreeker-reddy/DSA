// Last updated: 3/26/2026, 1:50:22 AM
public class Solution {
    public int Tribonacci(int n) {
        if( n is 0) return 0;
        if(n is 1) return 1;

        int twoBack= 0;
        int oneBack = 1;
        int current = 1;

        for(int i=3;i<=n;i++)
        {
            int temp= current+oneBack+twoBack;
            twoBack=oneBack;
            oneBack=current;
            current=temp;
        }
        return current;
    }
}