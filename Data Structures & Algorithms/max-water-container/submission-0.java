class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxarea=Integer.MIN_VALUE;
        while(left<right){
            int area=Math.min(heights[left],heights[right])*(right-left);
            maxarea=Math.max(area,maxarea);
            if(heights[left]>heights[right])
            right--;
            else left++;
        }
        return maxarea;

    }
}
