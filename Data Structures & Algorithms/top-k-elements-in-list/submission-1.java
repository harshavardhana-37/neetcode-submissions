class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int n=nums.length;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer>[] buckets= new List [nums.length+1];
        for(int i=0;i<n+ 1;i++){
            buckets[i]= new ArrayList<>();
        }
        for(int key:map.keySet()){
            int freq=map.get(key);
            buckets[freq].add(key);
        }
        int [] res= new int [k];
        int count=0;
        for(int i=buckets.length-1;i>=0 && count<k;i--){
            for(int num:buckets[i]){
                if(count==k) break;
                res[count++]=num;
            }
        }
        return res;
    }
}
