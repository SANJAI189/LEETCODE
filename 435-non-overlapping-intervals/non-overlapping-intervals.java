class Solution {
    class Inter{
        int start;
        int end;
        Inter(int start,int end){
            this.start = start;
            this.end = end;
        }
    }
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Inter[] arr = new Inter[n];
        for(int i=0;i<n;i++){
            arr[i] = new Inter(intervals[i][0],intervals[i][1]);
        }
        Arrays.sort(arr,Comparator.comparingInt(a->a.end));
        Inter temp = arr[0];
        int count = 1;
        int end_time = temp.end;

        for(int i=1;i<n;i++){
            Inter interval = arr[i];
            if(interval.start >= end_time){
                count += 1;
                end_time = interval.end;
            }
        }
        return n-count;
    }
}