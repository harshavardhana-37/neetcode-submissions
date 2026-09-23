class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int n=s.length();
        int maxfreq=0;
        int maxlen=0;
        HashSet<Character>set= new HashSet<>();
        for( right=0;right<n;right++){
            
            
            while(set.contains(s.charAt(right))){
                
               set.remove(s.charAt(left));
                left++;
            }
            char charright=s.charAt(right);
            set.add(charright);
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}
