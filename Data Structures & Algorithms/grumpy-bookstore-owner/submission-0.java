class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        
        int left=0;
        int windows=0;
        int maxwin=0;
        int satisfied=0;
        int n=customers.length;
        for(int right=0;right<n;right++){
            if(grumpy[right]==1) windows+=customers[right];
            else satisfied+=customers[right];
            if(right-left+1>minutes){
                if(grumpy[left]==1) windows-=customers[left];
                left+=1;
            }
            maxwin=Math.max(maxwin,windows);
        }
        return satisfied+maxwin;
    }
}