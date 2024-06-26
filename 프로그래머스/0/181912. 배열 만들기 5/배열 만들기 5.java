import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answerList = new ArrayList<>();

		for (String intStr : intStrs) {
			int num = Integer.parseInt(intStr.substring(s, s + l));
			if (num > k) {
				answerList.add(num);
			}
		}

		int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}