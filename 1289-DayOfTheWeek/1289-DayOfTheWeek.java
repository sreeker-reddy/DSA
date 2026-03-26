// Last updated: 3/26/2026, 1:50:09 AM
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int daysCount =0;
        for(int i=1971;i<year;i++){
            if(i%4==0)
                daysCount+=366;
            else
                daysCount+=365;
        }
        for(int i=1;i<month;i++){
            if(i==2)
            {
                if(year%4==0){
                    daysCount+=29;
                }
                else
                    daysCount+=28;
            }
            else if(i==4 || i==6 || i==9||i==11){
                daysCount+=30;
            }
            else 
                daysCount+=31;
        }
        
        daysCount+=day;
        int dayOfWeek = daysCount%7;
        Map<Integer, String> daysToName = new HashMap<Integer, String>();
        daysToName.put(0,"Thursday");
        daysToName.put(1,"Friday");
        daysToName.put(2,"Saturday");
        daysToName.put(3,"Sunday");
        daysToName.put(4,"Monday");
        daysToName.put(5,"Tuesday");
        daysToName.put(6,"Wednesday");
        return daysToName.get(dayOfWeek);
    }
}



