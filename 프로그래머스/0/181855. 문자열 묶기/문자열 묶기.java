class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] countArr = new int[31];

        for (String str : strArr) {
            countArr[str.length()]++;
        }

        for (int count : countArr) {
            answer = Math.max(answer, count);
        }

        return answer;
    }
}