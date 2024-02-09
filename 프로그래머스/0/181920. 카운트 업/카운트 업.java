class Solution {
    public int[] solution(int start_num, int end_num) {
        int arr_len = end_num - start_num;
        int[] answer = new int[arr_len+1];
        for(int i = 0 ; i < answer.length; i++){
            answer[i] = i+start_num;
        }
        return answer;
    }
}