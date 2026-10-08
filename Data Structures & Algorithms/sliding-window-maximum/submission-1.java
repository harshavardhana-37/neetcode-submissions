class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n= nums.length;
        int ans[]= new int [n-k+1];
        int count=0;
        PriorityQueue<Integer> heap= new PriorityQueue<>((a,b)->nums[b]-nums[a]);
        for(int i=0;i<k;i++)
        heap.offer(i);

        ans[count]=nums[heap.peek()];
        count++;
        for(int i=k;i<n;i++){
            heap.offer(i);
            while(heap.peek()<=i-k)
            heap.poll();
            ans[count++]= nums[heap.peek()];
        }
        return ans;
    }
}
