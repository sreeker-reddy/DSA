// Last updated: 3/26/2026, 1:50:04 AM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
      int[] test = new int[2001];
        int count =0;
        for(int i=0;i<arr.length;i++){
            int index;
            if(arr[i]<0){
              index = 1000-arr[i];  
            }
            else{
               index = arr[i]; 
            }
            test[index]++;
                if(test[index]==1)
                 count++;
        }
         ArrayList<Integer> list = new ArrayList<Integer>(); 
  
        for (int i = 0; i < test.length; i++) 
            list.add(new Integer(test[i])); 
         Set<Integer> set = new HashSet<Integer>(list);
  
        System.out.println(set);
        return (set.size()-1)==count;
    }
}