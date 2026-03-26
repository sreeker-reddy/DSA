// Last updated: 3/26/2026, 1:49:55 AM
class Solution {
    public String stringShift(String s, int[][] shift) {
        StringBuilder sb = new StringBuilder(s);
        
        for(int i=0;i<shift.length;i++){
            if(shift[i][0]==0){
                int k=0;
                while(k < shift[i][1]){
                    char c = sb.charAt(0);
                    sb.deleteCharAt(0);
                    sb.append(c);
                    k++;
                }
            }
            else if(shift[i][0]==1){
                int k=0;
                while(k < shift[i][1]){
                    char c = sb.charAt(sb.length()-1);
                    sb.deleteCharAt(sb.length()-1);
                    sb.insert(0,c);
                    k++;
                }
            }
            System.out.println(sb.toString());
        }
        return sb.toString();
    }
}