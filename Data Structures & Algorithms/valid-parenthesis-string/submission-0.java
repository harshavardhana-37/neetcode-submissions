class Solution {
    public boolean checkValidString(String s) {
        int leftmax=0;
        int leftmin=0;
        for(char ch:s.toCharArray()){
            if(ch=='(') {
                leftmin+=1;
                leftmax+=1;
            }
            else if(ch==')'){
                leftmin-=1;
                leftmax-=1;
            }
            else{
                leftmin-=1;
                leftmax+=1;
            }
            if(leftmin<0) leftmin=0;
            if(leftmax<0) return false;
        }
        return leftmin==0;
    }
}
