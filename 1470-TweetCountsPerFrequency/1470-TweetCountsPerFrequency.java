// Last updated: 3/26/2026, 1:49:19 AM
class TweetCounts {
    Map<String, List<Integer>> tweets;
    public TweetCounts() {
        tweets = new HashMap<>();
    }
    
    public void recordTweet(String tweetName, int time) {
        if(!tweets.containsKey(tweetName)){
            tweets.put(tweetName, new ArrayList<Integer>());
        }
        tweets.get(tweetName).add(time);
    }
    
    public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) {
        List<Integer> result = new ArrayList<>();
        if(!tweets.containsKey(tweetName)){
            return result;
        }
        
        List<Integer> times = tweets.get(tweetName);
        Collections.sort(times);
        
        char c = freq.charAt(0);
        int slot = c=='m' ?60:(c=='h'?3600 : 86400);
        
        int i=0;
        while(i<times.size() && times.get(i) < startTime){
            i++;
        }
        
        int start = startTime;
        while(start <=endTime){
            int count = 0;
            while(i<times.size() && times.get(i)<start+slot && times.get(i)<=endTime){
                count++;
                i++;
            }
            result.add(count);
            start+=slot;
        }
        
        return result;
    }
}

/**
 * Your TweetCounts object will be instantiated and called as such:
 * TweetCounts obj = new TweetCounts();
 * obj.recordTweet(tweetName,time);
 * List<Integer> param_2 = obj.getTweetCountsPerFrequency(freq,tweetName,startTime,endTime);
 */