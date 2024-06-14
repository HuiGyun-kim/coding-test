import java.util.*;
class Solution {
    public int[] solution(String myString) {
        return Arrays.stream(myString.split("x",-1))
                     .mapToInt(String::length)
                     .toArray();
    }
}