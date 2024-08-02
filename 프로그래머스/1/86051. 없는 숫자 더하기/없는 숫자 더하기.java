import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
		for(int i = 0; i <= 9; i++) {
			sum += i;
		}
        return sum - Arrays.stream(numbers).sum();
    }
}