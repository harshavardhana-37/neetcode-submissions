class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int i;
        int n=gas.length;
        int gassum=0;
        int costsum=0;
        for(int g:gas) gassum+=g;
        for(int c:cost) costsum+=c;
        if(gassum<costsum) return -1;
        int total=0;
        int pos=0;
        for( i=0;i<n;i++){
            total+=(gas[i]-cost[i]);
            if(total<0) {
                total=0;
                pos=i+1;
            }
        }
        return pos;
    }
}
