class Solution {
    public int minimumPushes(String word) {
        int ans = 0;
        int push = 1;
        int j =0;
        int[] freq = new int[26];
        for(int i=0;i<word.length();i++){
            freq[word.charAt(i) - 'a']++;
        }
        Arrays.sort(freq);
        int i = 25;
        while(i>=0 && freq[i]!=0){
            if(j==8){
                push++;
                j = 0;
            }
            ans += freq[i]*push;
            i--;
            j++;
        }
        return ans;
    }
}