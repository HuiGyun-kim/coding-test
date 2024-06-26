class Solution {
    public int[] solution(int n, int k) {
        int size = (n / k);
        int[] answer = new int[size];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                answer[index] = i;
                index++;
            }
        }

        return answer;
    }
}