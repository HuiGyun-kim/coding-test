class Solution {
    public int solution(String myString, String pat) {
		String result = "";
		for(char c : myString.toCharArray()){
			if(c == 'A'){
				result += 'B';
			}else{
				result += 'A';
			}
		}
		int answer = result.contains(pat) ? 1 : 0;
        return answer;
    }
}