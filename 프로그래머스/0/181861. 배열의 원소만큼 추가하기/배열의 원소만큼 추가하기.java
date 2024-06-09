import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> xList = new ArrayList<>();

        for (int a : arr) {
            for (int i = 0; i < a; i++) {
                xList.add(a);
            }
        }
        
        int[] answer = new int[xList.size()];
        for (int i = 0; i < xList.size(); i++) {
            answer[i] = xList.get(i);
        }

        return answer;
    }
}