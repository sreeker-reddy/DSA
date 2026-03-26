// Last updated: 3/26/2026, 1:50:33 AM
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        int[] result = new int[arr1.length];
        int[] work = new int[1001];
        for(int i=0;i<arr1.length;i++){
            work[arr1[i]]++;
        }
        int k=0;
        for(int i=0;i<arr2.length;i++){
           int j=work[arr2[i]];
            while(j>0 && k<arr1.length){
                result[k++]=arr2[i];
                j--;
                work[arr2[i]]--;
                
            }
        }
        for(int i=0;i<=1000;i++){
            if(work[i]>0){
                int j=work[i];
                while(j>0 && k<arr1.length){
                    result[k++]=i;
                    j--;
                    work[i]--;
                
                }
            }
        }
        
        return result;
    }
}