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
        intervals.sort((a,b)-> Integer.compare(a.start,b.start));
        int n=intervals.size();
        for(int i=0;i<n-1;i++){
            int a=intervals.get(i).end;
            int b=intervals.get(i+1).start;
            if(a>b) return false;
        }
        return true;
    }
}
