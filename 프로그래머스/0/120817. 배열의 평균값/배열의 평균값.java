class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(double avg : numbers){
            answer += avg;
        }
        double result = answer/numbers.length;
        return result;
    }
}