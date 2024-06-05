import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        List<String> answerList = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                answerList.add(strArr[i]);
            }
        }
        String[] answer = answerList.toArray(new String[0]);
        return answer;
    }
}