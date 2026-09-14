class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int area=0;
        int maxarea=area;
        while(left<right){
            area=Math.min(heights[left],heights[right])*(right-left);
            maxarea=Math.max(area,maxarea);
            if(heights[left]>=heights[right]) right--;
            else left++;
         
        }
        return maxarea;
    }
}
