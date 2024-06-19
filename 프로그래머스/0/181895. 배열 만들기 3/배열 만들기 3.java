import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] first = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
        int[] second = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);
        
        int[] answer = new int[first.length + second.length];
        System.arraycopy(first, 0, answer, 0, first.length);
        System.arraycopy(second, 0, answer, first.length, second.length);
        
        return answer;
    }
}