class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       
       StringBuilder sb1=new StringBuilder();
       for(String word: word1){
        for(char ch:word.toCharArray())
        sb1.append(ch);

       }
       StringBuilder sb2= new StringBuilder();

       for(String word:word2){
        for(char ch:word.toCharArray())
        sb2.append(ch);
       }
       int left=0;
       int right=0;
       int n1=sb1.length();
       int n2=sb2.length();
       if (n1!=n2) return false;

       while(left<n1 && right<n2){
        char ch1=sb1.charAt(left);
        char ch2=sb2.charAt(left);
        if(ch1!=ch2) return false;
        left+=1;
       }
       return true;
    }
}
