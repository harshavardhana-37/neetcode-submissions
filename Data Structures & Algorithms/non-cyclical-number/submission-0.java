class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set= new HashSet<>();
        while(!set.contains(n)){
            set.add(n);
            n=sqofno(n);
             if(n==1)
        return true;
        }
        return false;
    }
    public int sqofno(int n){
        int res=0;
        while(n!=0){
            int digit=n%10;
            res=res+(digit*digit);
            n/=10;
        }
        return res;
    }
}
