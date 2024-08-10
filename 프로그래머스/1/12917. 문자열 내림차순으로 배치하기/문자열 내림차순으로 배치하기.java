import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] charArray = s.toCharArray();  // 문자열을 문자 배열로 변환
        Arrays.sort(charArray);  // 문자 배열을 오름차순으로 정렬
        return new StringBuilder(new String(charArray)).reverse().toString();
    }
}
