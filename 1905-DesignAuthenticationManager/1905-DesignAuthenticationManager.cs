// Last updated: 3/26/2026, 1:47:46 AM
public class AuthenticationManager {
    Dictionary<string, int> dict;
    int ttl;
    public AuthenticationManager(int timeToLive) {
        dict = new();
        ttl = timeToLive;
    }
    
    public void Generate(string tokenId, int currentTime) {
        if(!dict.ContainsKey(tokenId))
            dict.Add(tokenId, currentTime+ttl);
    }
    
    public void Renew(string tokenId, int currentTime) {
        if(dict.ContainsKey(tokenId) && dict[tokenId]>currentTime)
            dict[tokenId]=currentTime + ttl;
    }
    
    public int CountUnexpiredTokens(int currentTime) {
        return dict.Where(kvp=>kvp.Value>currentTime).ToList().Count;
    }
}

/**
 * Your AuthenticationManager object will be instantiated and called as such:
 * AuthenticationManager obj = new AuthenticationManager(timeToLive);
 * obj.Generate(tokenId,currentTime);
 * obj.Renew(tokenId,currentTime);
 * int param_3 = obj.CountUnexpiredTokens(currentTime);
 */