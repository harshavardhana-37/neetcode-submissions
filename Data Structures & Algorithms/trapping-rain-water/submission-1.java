class Solution {
    public int trap(int[] height) {
        int left=0;
        int n=height.length;
        int right=n-1;
        int maxleft=0;
        int water=0;
        int maxright=0;
        while(left<=right){
            // checking 
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
