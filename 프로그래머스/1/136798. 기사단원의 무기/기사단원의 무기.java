class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
            int divCount = divCount(i);
            
            if (divCount > limit) {
                answer += power;
            } else {
                answer += divCount;
            }
        }
        
        return answer;
    }
    
    private int divCount(int num) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (i * i == num) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
}