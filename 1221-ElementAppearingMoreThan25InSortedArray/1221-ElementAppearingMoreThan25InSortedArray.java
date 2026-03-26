// Last updated: 3/26/2026, 1:50:31 AM
class Solution {
    public int findSpecialInteger(int[] arr) {
        int max = 0;
        int element = -1;
        for(int i=0;i<arr.length;i++){
            int j=i+1;
            while(j<arr.length && arr[j] == arr[i]){
                j++;
            }
            if(max < (j-i)){
                max = (j-i);
                element = arr[i];
            }
            i=i+(j-i);
        }
        return element;
    }
}