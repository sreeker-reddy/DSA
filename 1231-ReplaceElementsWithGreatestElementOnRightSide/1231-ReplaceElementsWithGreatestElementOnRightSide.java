// Last updated: 3/26/2026, 1:50:24 AM
class Solution {
    public int[] replaceElements(int[] arr) {
        int end = arr.length-2;
        int max = arr[arr.length-1];   //Integer.MIN_VALUE;
        
        while(end>=0){
            int temp = arr[end];
            arr[end] = max;
            max = Math.max(max,temp);
            end--;
        }
        
        arr[arr.length-1] = -1;
        return arr;
        
    }
    
}