class Solution {

    public String encode(List<String> strs) {
         String res="";
        for(String str: strs){
            res+=str.length()+"#"+str;
        }
        return res;

    }

    public List<String> decode(String s) {
         List<String> res= new ArrayList<>();
        int i=0;
        int j;
        while(i<s.length()){
            j=i;
            while(s.charAt(j)!='#'){
                j++;
            }
            int length=Integer.parseInt(s.substring(i,j));
            String word=s.substring(j+1,j+1+length);
            res.add(word);
            i=j+1+length;
        }
        return res;
    }
}
