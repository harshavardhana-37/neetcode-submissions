class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> curr= new ArrayList<>();
        int n=nums.length;
        boolean[] pick= new boolean[n];
        backtrack(res,curr, n,pick,nums);
        return res;
    }
    public void     backtrack(List<List<Integer>> res , List<Integer> curr, int n, boolean[] pick,int nums[]){
            if(curr.size()>=n){
                res.add(new ArrayList<>(curr));
                return ;
            }

            for(int i=0;i<n;i++){
                if(!pick[i]){
                    curr.add(nums[i]);
                    pick[i]=true;
                    backtrack(res,curr,n,pick,nums);
                    curr.remove(curr.size()-1);
                    pick[i]=false;
                }
            }
        }
    }

