// Last updated: 3/26/2026, 1:49:54 AM
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        double dist = -1;
        for(int i=1;i<coordinates.length;i++){
            double x = (coordinates[i-1][0] - coordinates[i][0]);
            double y = (coordinates[i-1][1] - coordinates[i][1]);
            //x = Math.pow(x,2);
           // y = Math.pow(y,2);
            System.out.println(y/x);
            if(dist == -1){
                dist =y/x;
            }
            else if(y/x !=dist)
                return false;
        }
        return true;
    }
}