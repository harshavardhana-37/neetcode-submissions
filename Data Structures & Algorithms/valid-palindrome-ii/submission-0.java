class Solution {
    public boolean validPalindrome(String s) {
        int n=s.length();
        int left=0;
        int right=n-1;
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                right--;
                left++;
            }
            else{
                if(ispal( s,left+1,right)|| ispal( s,left,right-1)) return true;
                else return false;
            }
        }
        return true;
    }
    public boolean ispal(String s, int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
        right--;
        }
        
        return true;


    }
}