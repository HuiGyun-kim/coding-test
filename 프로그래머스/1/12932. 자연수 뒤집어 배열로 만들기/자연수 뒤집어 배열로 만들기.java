class Solution {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
		for(int i = 0; i < answer.length; i++) {
			char c = String.valueOf(n).charAt(i);
			answer[answer.length - i - 1] = Character.getNumericValue(c);
		}
        return answer;
    }
}