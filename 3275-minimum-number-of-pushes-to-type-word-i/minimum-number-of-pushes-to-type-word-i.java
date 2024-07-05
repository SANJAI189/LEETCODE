// class Solution {
//   public int minimumPushes(String word) {
//      int n=word.length();
//      if(n<=8){
//         return n;
//      }
//      int sum=0;
//      int i=1;
//      while(n>8){
//         n=n-8;
//         sum=sum+i*8;
//         i++;
//      }
//      return sum+n*i;
//     }
// }



class Solution {
    public int minimumPushes(String word) {
        int count=0;
        if(word.length()/8==0){
            count=word.length()%8;
        }else if(word.length()/8==1){
            count=8+(word.length()%8)*2;
        }
        else if(word.length()/8==2){
            count=24+(word.length()%8)*3;
        }else {
            count=48+(word.length()%8)*4;
        }
        return count;
    }
}