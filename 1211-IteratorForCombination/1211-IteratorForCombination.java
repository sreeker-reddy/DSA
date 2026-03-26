// Last updated: 3/26/2026, 1:50:32 AM
class CombinationIterator {
    List<String> combinationList = new LinkedList<String>();
    int index = 0;
    public CombinationIterator(String characters, int combinationLength) {
        backtrack(characters, combinationLength,new StringBuilder(),0);
    }
    
    private void backtrack(String characters, int combinationLength,StringBuilder currentString, int index){
        if(currentString.length() == combinationLength){
            combinationList.add(currentString.toString());
            return;
        }
        for(int i=index;i<characters.length();i++){
            currentString.append(characters.charAt(i));
            backtrack(characters, combinationLength,currentString,i+1);
            currentString.deleteCharAt(currentString.length()-1);
        }
        
    }
    
    public String next() {
      //  if(hasNext())
        return combinationList.get(index++);
        
    }
    
    public boolean hasNext() {
        return index < combinationList.size();
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */