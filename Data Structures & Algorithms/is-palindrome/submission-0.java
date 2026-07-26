class Solution {
    public boolean isPalindrome(String s) {
        String res= "";
        int i;
        for(i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                ch=Character.toLowerCase(ch);
                res+=ch;

            }
        }
        int start=0;
        int end=res.length()-1;
        while(start<end){
            if(res.charAt(start)!=res.charAt(end)){
                return false;
            }
            start++;
            end--;

        }
        return true;
        
    }
}
