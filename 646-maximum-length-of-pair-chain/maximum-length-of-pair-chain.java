class Solution {
    class Temp{
        int start;
        int end;
        int pos;
        Temp(int start,int end,int pos){
           this.start = start;
           this.end = end;
           this.pos = pos;
        }
    }
    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        Temp[] temp = new Temp[n];
        for(int i=0;i<n;i++){
            temp[i] = new Temp(pairs[i][0],pairs[i][1],i);
        }
        Arrays.sort(temp,Comparator.comparingInt(a->a.end));

        Temp tp = temp[0];
        int count = 1;
        int end_time = tp.end;

        for(int i=1;i<n;i++){
            Temp tmp = temp[i];
            if(tmp.start > end_time){
                count += 1;
                end_time = tmp.end;
            }
        }
        return count;
    }
}