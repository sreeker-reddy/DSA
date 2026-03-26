// Last updated: 3/26/2026, 1:48:09 AM
class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>((a,b)->b[2]-a[2]);
        int max = Integer.MIN_VALUE;
        
        for(int[] point : points){
            while(!queue.isEmpty() && point[0] - queue.peek()[0] >k){
                queue.poll();
            }
            if(!queue.isEmpty()){
                int[] current = queue.peek();
                max  = Math.max(max,current[2] + point[0]+point[1]);
            }
            queue.add(new int[]{point[0],point[1],point[1]-point[0]});
        }
        return max;
    }
}