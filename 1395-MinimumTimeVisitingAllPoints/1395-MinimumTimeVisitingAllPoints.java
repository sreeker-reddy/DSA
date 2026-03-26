// Last updated: 3/26/2026, 1:49:44 AM
class Solution {
    public static int getMin(int x, int y){
        if(x>=y)
            return x;
        return y;
    }
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        int current_x = 0;
        int current_y =0;
        current_x = points[0][0];
        current_y = points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0]==points[i][1] && current_x == current_y){
                time+=Math.abs(points[i][0]-current_x);
            }
            else{
                int x_diff = Math.abs(current_x - points[i][0]);
                int y_diff = Math.abs(current_y - points[i][1]);
                  if(x_diff>=y_diff){
                        time+=y_diff;   
                    }
                    else{
                        time+=x_diff;
                    }
                    int diff = Math.abs(x_diff - y_diff);
                    time+=diff; 
                }

            
            current_x = points[i][0];
            current_y = points[i][1];
        }
    return time;
    }
}