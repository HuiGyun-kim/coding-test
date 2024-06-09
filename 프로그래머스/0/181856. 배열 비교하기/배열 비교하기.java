import java.util.*;
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length) {
            return 1;
        } else if (arr1.length < arr2.length) {
            return -1;
        } else {
            int arrsum1 = Arrays.stream(arr1).sum();
            int arrsum2 = Arrays.stream(arr2).sum();
            return arrsum1 > arrsum2 ? 1 : arrsum1 == arrsum2 ? 0 : -1;
        }
    }
}