/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        for(int i=0;i<intervals.size();i++){
            Interval a=intervals.get(i);
            for(int j=i+1;j<intervals.size();j++){
                Interval b=intervals.get(j);
                if(Math.max(a.start,b.start)<Math.min(a.end,b.end)) return false;
            }
        }
        return true;
    }
}
