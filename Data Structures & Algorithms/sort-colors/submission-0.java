class Solution {
    public void sortColors(int[] nums) {
        int zc=0;
        int oc=0;
        int tc=0;
        int n=nums.length;

        for(int num:nums){
             if(num==0)zc++;
             if(num==1)oc++;
             if(num==2)tc++;
        }
      //  int ans= new int [n];
        for(int i=0;i<zc;i++)
        nums[i]=0;
        for(int i=zc;i<zc+oc;i++)
        nums[i]=1;
        for(int i=zc+oc;i<n;i++) nums[i]=2;
      //  return nums;
    }
}