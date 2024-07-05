class Solution {
    public int minCost(String colors, int[] n) {
        int ans = 0;
        for(int i=0;i<colors.length()-1;i++){
            if(colors.charAt(i)==colors.charAt(i+1)){
                if(n[i]<n[i+1]){
                    ans += n[i];
                }
                else{
                    ans += n[i+1];
                    n[i+1] = n[i];
                }
            }
        }
        return ans;
    }
}