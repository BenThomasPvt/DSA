class Solution {
    public int maxArea(int[] h) {
        int l=0, r=h.length-1, ans=0;
        while(l<r){
            ans = Math.max(ans, Math.min(h[l],h[r])*(r-l));
            if(h[l]<h[r]) l++; else r--;
        }
        return ans;
    }
}
