import static java.lang.Integer.*;
class Solution {
    public int solution(String binomial) {
        int answer = 0;
		for (int i = 0; i < binomial.split(" ").length; i++) {
			if(binomial.split(" ")[1].equals("+")) {
				return answer = parseInt(binomial.split(" ")[0]) + parseInt(binomial.split(" ")[2]);
			}else if(binomial.split(" ")[1].equals("-")) {
				return answer = parseInt(binomial.split(" ")[0]) - parseInt(binomial.split(" ")[2]);
			}else if(binomial.split(" ")[1].equals("*")) {
				return answer = parseInt(binomial.split(" ")[0]) * parseInt(binomial.split(" ")[2]);
			}else if(binomial.split(" ")[1].equals("/")) {
				return answer = parseInt(binomial.split(" ")[0]) / parseInt(binomial.split(" ")[2]);
			}
		}
    return answer;
    }
}