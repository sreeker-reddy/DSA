// Last updated: 3/26/2026, 1:48:16 AM
class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int[] result = new int[k];
        int n = arr.length;
        int med_index = (n-1)/2;
        int median = arr[med_index];
        
        Integer[] newArr = Arrays.stream(arr).boxed().toArray( Integer[]::new );
       Arrays.sort(newArr, new Comparator<Integer>(){
           public int compare(Integer a, Integer b){
               int a_ff = Math.abs(a-median);
               int b_ff = Math.abs(b-median);
               if(a_ff == b_ff){
                   return b-a;
               }
               return b_ff - a_ff;
           }
       });
        
     /*  for(int i=0;i<n;i++){
         //   int[] x = list.get(i);
            System.out.println(x[0] + "  " + x[1] + "  " + x[2]);
        }
        
       */ 
        for(int i=0;i<k;i++){
            result[i] = newArr[i];
        }
       
        return result;
    }
}
