class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int r = 0,l=0,maxlen =0,zeros=0;
        while(r<n){
            if(nums[r] == 0){
                zeros++;
            }
            //if it is exceeded when run a loop to move l to find the next possible solution 
            while(zeros > k){
                if(nums[l] == 0){
                    zeros--;
                }
                l++;
            }
            if(zeros <= k){
                maxlen = Math.max(maxlen,r-l+1);
            }    
            r++;
        }
        return maxlen;
    }
}

// BRUTE-FORCE

// class Solution {
//     public int longestOnes(int[] nums, int k) {
//         int zeros = 0;
//         int maxlen = 0;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i;j<nums.length;j++){
//                 if(nums[j] == 0){
//                     zeros++;
//                 }
//                 if(zeros <= k){
//                     maxlen = Math.max(maxlen,j-i+1);
//                 }
//                 if(zeros > k){
//                     break;
//                 }
//             }
//             zeros = 0;
//         }
//         return maxlen;
//     }
// }