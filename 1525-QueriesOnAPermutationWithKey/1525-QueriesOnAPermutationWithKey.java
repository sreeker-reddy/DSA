// Last updated: 3/26/2026, 1:48:33 AM
class Solution {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> list = new LinkedList<Integer>();
        int index = 0;
        int[] result = new int[queries.length];
        for(int i=1;i<=m;i++){
            list.add(i);
        }
        
        for(int q : queries){
            int itemIndex = list.indexOf(q);
            result[index++] = itemIndex;
            list.remove(itemIndex);
            list.add(0,q);
        }
        return result;
    }
}