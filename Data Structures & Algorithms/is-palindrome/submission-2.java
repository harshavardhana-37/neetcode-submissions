class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        int left=0;
       
        String res="";
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                res+=Character.toLowerCase(ch);
            }

        }
         int right=res.length()-1;
        while(right>=left){
            char ch1=res.charAt(left);
            char ch2=res.charAt(right);
            if(ch1!=ch2){
                return false;
            }
            left++;
            right--;
            
        }
        return true;
    }
}
