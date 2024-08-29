class Solution {
    public boolean isPerfectSquare(int num) {
        return search(num);
    }
    public static boolean search(int num){
        long l = 1 , r = num;
        while(l <= r){
            long mid = l+(r - l) / 2;
            if(mid * mid == num){
                return true;
            }
            if(mid*mid > num){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return false;
    }
}