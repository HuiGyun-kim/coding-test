class Solution {
    public String solution(int n) {
        String answer = "수";
        for(int i = 1; i < n; i++){
            answer += i % 2 == 1 ? "박" : "수";
        }
        return answer;
    }
}