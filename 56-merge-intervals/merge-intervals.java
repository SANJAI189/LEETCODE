class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        int n = intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });
        
        int[] currentInterval = intervals[0];

        for(int i=1;i<n;i++){
            int[] interval = intervals[i];
            if(currentInterval[1] >= interval[0]){
                currentInterval[1] = Math.max(interval[1],currentInterval[1]);
            }
            else{
                res.add(currentInterval);
                currentInterval = interval;
            }
        }
        //Here the last interval not added that's why
        res.add(currentInterval);


        int[][] ans = new int[res.size()][2];
        for(int k=0;k<res.size();k++){
            ans[k] = res.get(k);
        }
        return ans;
    }
}