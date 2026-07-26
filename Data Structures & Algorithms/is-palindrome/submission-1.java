class Solution {
    public boolean isPalindrome(String s) {

        int n=s.length();
        int i;
        int left=0;
        

        String res="";
        for(i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                ch=Character.toLowerCase(ch);
                res+=ch;
            }
        }
        int n1=res.length();
        int right=n1-1;
        while(left<right){
            if(res.charAt(right)!=res.charAt(left)){
                return false;

            }
            else{
                left++;
                right--;
            }
        }
        return true;
        
    }
}
