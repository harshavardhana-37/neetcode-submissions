class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int i;
        int j=0;
        int maxlen=0;
        HashSet <Character> set= new HashSet<>();
        for(i=0;i<n;i++){
            char ch=s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(j));
                j++;

            }
            set.add(ch);
            maxlen=Math.max(maxlen,i-j+1);
        }
        return  maxlen;
    }
}
