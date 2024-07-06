class Solution {
    public int minOperations(int[] nums) {
        int flip = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(flip == nums[i]){
                flip = (nums[i]==0)?1:0;
                count++;
            }
        }
        return count;
    }
}
