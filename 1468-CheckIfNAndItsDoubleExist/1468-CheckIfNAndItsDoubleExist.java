// Last updated: 3/26/2026, 1:49:24 AM
class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        
        for(int i=0;i<arr.length;i++){
            if((arr[i]%2==0 && set.contains(arr[i]/2)) || set.contains(arr[i]*2)){
                System.out.println(arr[i]);
                return true;
            }
                
            set.add(arr[i]);
        }
        return false;
    }
}