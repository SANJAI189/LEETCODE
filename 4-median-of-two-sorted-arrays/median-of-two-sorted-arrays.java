class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = 0;
        int[] nums3 = new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            nums3[i] = nums1[i];
            n++;
        }
        for(int i=0;i<nums2.length;i++){
            nums3[n] = nums2[i];
            n++;
        }
        Arrays.sort(nums3);
        double sum =0;
        
        for(int i=0;i<nums3.length;i++){
            sum += nums3[i];
        }
        double ans = 0;
        if(nums3.length % 2 == 0){
            ans = (nums3[nums3.length/2 -1] + nums3[nums3.length / 2]) / 2.0;
        }
        else{
            ans = nums3[nums3.length/2];
        }
        return ans;
    }
}