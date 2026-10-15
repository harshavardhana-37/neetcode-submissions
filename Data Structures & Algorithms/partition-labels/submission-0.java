class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        int i;
        int n=s.length();
        for(i=0;i<n;i++){
            map.put(s.charAt(i),i);
        }
        int end=0;
        int size=0;
        List<Integer> res = new ArrayList<>();
        for(i=0;i<n;i++){
            size++;
            end=Math.max(end,map.get(s.charAt(i)));
            if(end==i){
                res.add(size);
                size=0;
            }
        }
        return res;
    }
}
