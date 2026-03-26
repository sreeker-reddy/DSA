// Last updated: 3/26/2026, 1:49:51 AM
/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */
class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        findSol(customfunction,z,result,1,1000);
        return result;
    }
    
    public void findSol(CustomFunction customfunction, int z, List<List<Integer>> result, int x, int y){
        if(x>1000 || y<1)
            return;
        int fxy  = customfunction.f(x,y);
        if(fxy>z){
            findSol(customfunction,z,result,x,y-1);
            return;
        }
        else if(fxy==z)
        {
            result.add(Arrays.asList(x,y));
            findSol(customfunction,z,result,x+1,y-1);
        }
        else
            findSol(customfunction,z,result,x+1,y);
        
    }
}


