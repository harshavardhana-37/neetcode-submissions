class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> map= new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length+1];
        for( int i=0;i<buckets.length;i++){
            buckets[i]= new ArrayList<>();
        }
        for( int key: map.keySet()){
           int  frequency=map.get(key);
            buckets[frequency].add(key);
        }
        int ans[]= new int[k];
        int indx=0;
        for(int i=n;i>0 && indx<k;i--){
            for(int num:buckets[i]){
            ans[indx++]=num;
            }
            if(indx==k){
                return ans;
            }
        }
        return ans;
        
    }
}
