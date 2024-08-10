import java.util.*;

class Solution {
    public String solution(String s) {
        String[] strNumbers = s.split(" ");
        
        List<Integer> numbers = new ArrayList<>();
        for (String str : strNumbers) {
            numbers.add(Integer.parseInt(str));
        }
        
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        
        return min + " " + max;
    }
}
