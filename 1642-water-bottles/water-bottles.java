class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        int emp_count = numBottles;
        while(emp_count/numExchange >=1){
            sum += emp_count/numExchange;
            emp_count = emp_count/numExchange + emp_count%numExchange;
        }
        return sum;
    }
}