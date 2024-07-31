class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int farthest = 0;
        int l = 0,r=0,jumps = 0;
        while(r<n-1){
            for(int i=l;i<=r;i++){
                farthest = Math.max(i+nums[i],farthest);
            }
            l = r + 1;
            r = farthest;
            jumps += 1;
        }
        return jumps;
    }
}