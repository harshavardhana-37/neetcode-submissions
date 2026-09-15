class Solution {
    public int minimumRecolors(String s, int k) {
        int left=0;
        int n=s.length();
        int right=0;
        int count=0;
        int maxcount=0;
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(ch=='W') count++;
        }
        maxcount=count;
        for(int i=k;i<n;i++){
            if(s.charAt(i)=='W')count++;
            if(s.charAt(i-k)=='W') count--;
            maxcount=Math.min(count,maxcount);
        }
        return maxcount;
    }
}