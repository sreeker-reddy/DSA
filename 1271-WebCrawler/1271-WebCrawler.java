// Last updated: 3/26/2026, 1:50:13 AM
/**
 * // This is the HtmlParser's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface HtmlParser {
 *     public List<String> getUrls(String url) {}
 * }
 */

class Solution {
    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        
        String baseUrl = startUrl.substring(7);
        String hostName = baseUrl.split("/")[0];
        System.out.println(hostName);
        Queue<String> queue = new LinkedList<>();
        queue.add(startUrl);
        List<String> result = new ArrayList<>();
        Set<String> set = new HashSet<>();
        
        while(!queue.isEmpty()){
            String current = queue.poll();
            if(!result.contains(current))
                result.add(current);
            List<String> temp = htmlParser.getUrls(current);
            
            for(String t : temp){
                if(!set.contains(t) && t.indexOf(hostName)!=-1){
                    queue.add(t);
                    set.add(t);
                }
                
            }
        }
        
        return result;
    }
}