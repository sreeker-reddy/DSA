// Last updated: 3/26/2026, 1:47:52 AM
class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int start = 1;
        int current = 1;
        for(int i=1;i<=n;i++){
            total+=current;
            current+=1;
            
            if(i%7==0){
                start=start+1;
                current=start;
            }
        }
        return total;
    }
}

//10
// 1+2+3+4+5+6+7+2+3