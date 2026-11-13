class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(0,res,curr,nums);
        return res;
    }
    private void backtrack(int i, List<List<Integer>> res, List<Integer> curr, int nums[]){
        if(i>=nums.length){
        res.add(new ArrayList<>(curr));
        return;
        }
        curr.add(nums[i]);
        backtrack(i+1,res,curr,nums);
        curr.remove(curr.size()-1);
        backtrack(i+1,res, curr,nums);

    }
}
