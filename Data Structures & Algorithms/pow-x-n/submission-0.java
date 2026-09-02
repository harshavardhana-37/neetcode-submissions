class Solution {
    public double myPow(double x, int n) {
        long power=n;
        double res=1.0;
        if(n<0){
            x=1/x;
            power=-power;
        }
        while(power>0){
            if(power%2==1){
                res*=x;
            }
            power/=2;
            x*=x;
        }
        return res;
    }
}
