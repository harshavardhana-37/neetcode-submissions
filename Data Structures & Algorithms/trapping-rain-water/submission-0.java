class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int maxright=height[right];
        int maxleft=height[left];
        int water=0;
        while(right>=left){
            if(maxleft<maxright){
                maxleft=Math.max(maxleft,height[left]);
                water+=maxleft-height[left];
                left++;
            }
            else{
                maxright=Math.max(maxright,height[right]);
                water+=maxright-height[right];
                right--;
            }
        }
        return water;
    }
}
