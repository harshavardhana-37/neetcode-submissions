class Solution {
    public int totalFruit(int[] nums) {
        int right=0;
        int left=0;
        int maxlen=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        int n=nums.length;
        for(right=0;right<n;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size()>2){
                map.put(nums[left],map.get(nums[left])-1);
                
                if(map.get(nums[left])==0) map.remove(nums[left]);
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}