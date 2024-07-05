class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int res[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int ele = nums[i];
            int temp = -1;
            boolean flag = false;
            if(true){
                 for(int j=i+1;j<nums.length;j++){
                     if(nums[j]>ele){
                      temp = nums[j];
                      flag = true;
                      break;
                }
            }
            }
            if(temp == -1 && flag== false){
                for(int k=0;k<nums.length;k++){
                    if(nums[k]>ele){
                        temp = nums[k];
                        flag = true;
                        break;
                    }
                }
            }

            if(flag == false){
                res[i] =  -1;
            }
            else{
                res[i] = temp;
            }
        }
        return res;
    }
}