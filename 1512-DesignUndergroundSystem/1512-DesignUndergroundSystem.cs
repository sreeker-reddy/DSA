// Last updated: 3/26/2026, 1:55:02 AM
public class UndergroundSystem {
    Dictionary<int, (string,int)> checkin;
    Dictionary<string,(int count,double avg)> averageTimes;

    public UndergroundSystem() {
        checkin = new();
        averageTimes = new();
    }
    
    public void CheckIn(int id, string stationName, int t) {
        if(!checkin.ContainsKey(id))
        {
            checkin.Add(id,(stationName,t));
        }
        checkin[id] = (stationName,t);
    }
    
    public void CheckOut(int id, string stationName, int t) {
        var startStation = checkin[id];

        string route = checkin[id].Item1+"->"+stationName;
        int time = t - startStation.Item2;

        if(!averageTimes.ContainsKey(route))
        {
            averageTimes.Add(route,(0,0));
        }
        var calc = averageTimes[route];
        averageTimes[route] = (calc.count+1, (double)(((double)calc.count*calc.avg)+time)/(calc.count+1));
    }
    
    public double GetAverageTime(string startStation, string endStation) {
        return averageTimes[startStation+"->"+endStation].avg;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.CheckIn(id,stationName,t);
 * obj.CheckOut(id,stationName,t);
 * double param_3 = obj.GetAverageTime(startStation,endStation);
 */