import static java.lang.Double.*;
class Solution {
    public int solution(String number) {
        int answer = 0;
        if(parseDouble(number) > 0){
            for (int i = 0; i < number.length(); i++) {
			answer += parseDouble(number.charAt(i) + "");
		    }
        }
        return answer%9;
    }
}