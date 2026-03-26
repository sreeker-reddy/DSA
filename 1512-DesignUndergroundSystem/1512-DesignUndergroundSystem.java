// Last updated: 3/26/2026, 1:55:04 AM
class UndergroundSystem {
    Map<Integer,Pair<String,Integer>> checkIn;
    Map<String, Pair<Integer,Integer>> avg;
    
    public UndergroundSystem() {
        checkIn = new HashMap<>();
        avg = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkIn.put(id,new Pair(stationName,t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Pair<String,Integer> source = checkIn.get(id);
        
        String stationKey = source.getKey() + "#" + stationName;
        int totalTime = t-source.getValue();
        if(!avg.containsKey(stationKey)){
            avg.put(stationKey,new Pair(totalTime,1));
        }
        else{
            Pair<Integer,Integer> old_value = avg.get(stationKey);
            Pair<Integer,Integer> new_value = new Pair(old_value.getKey() + totalTime,old_value.getValue()+1);
            avg.put(stationKey,new_value);
        }
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String stationKey = startStation+"#"+endStation;
        Pair<Integer,Integer> timeValue = avg.get(stationKey);
        return (double)timeValue.getKey()/timeValue.getValue();
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 
 checkinMap - [ID,Pair<sourceStation,time)]
 checkout - 
 Source station, start time, end time = end time- start time = totalTime,
 
 AverageTime - [SourceStation-DestinationStation, <TotalTime,count>]
 
 
 */