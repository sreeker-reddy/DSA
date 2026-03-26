// Last updated: 3/26/2026, 1:48:10 AM
class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0,y=0;
        Set<Pair<Integer,Integer>> visited = new HashSet<>();
        visited.add(new Pair(0,0));
        for(int i=0;i<path.length();i++){
            char direction = path.charAt(i);
            
            if(direction=='E'){
                x+=1;
            }
            if(direction == 'W'){
                x-=1;
            }
            if(direction == 'N'){
                y+=1;
            }
            if(direction == 'S'){
                y-=1;
            }
            
            Pair<Integer,Integer> coord = new Pair(x,y);
         //   System.out.println(coord[0] + "  " + coord[1]);
            if(visited.contains(coord))
                return true;
            visited.add(coord);
        }
        return false;
    }
}