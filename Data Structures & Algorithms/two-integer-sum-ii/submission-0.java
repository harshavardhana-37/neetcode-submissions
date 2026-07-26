class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int right=n-1;
        int left=0;
        while(right>=left){
            if(numbers[right]+numbers[left]>target){
                right--;
            }
            else if(numbers[right]+numbers[left]<target){
                left++;
            }
            else{
                return new int []{left+1, right+1};
            }
        }
        return new int [] {-1,-1};
    }
}
