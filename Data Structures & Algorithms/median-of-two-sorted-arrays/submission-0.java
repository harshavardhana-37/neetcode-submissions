class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;

        int merged[] = new int [n1+n2];
        System.arraycopy(nums1,0,merged,0,n1);
        System.arraycopy(nums2,0,merged,n1,n2);
        Arrays.sort(merged);
        int tl=merged.length;
        if((tl)%2==0) return (merged[tl/2-1]+merged[tl/2])/2.0;
        else return merged[tl/2];
    }
}
