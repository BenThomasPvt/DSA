class Solution {
    public int fib(int n) {
        if(n==1 || n==0) return n;
        int one = 0;
        int two = 1;
        for(int i = 1;i<=n; i++){
            int res = one + two;
            one = two;
            two = res;
        }
        return one;
    }
}