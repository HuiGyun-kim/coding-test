import java.util.stream.Collectors;

class Solution {
    public long solution(long n) {
        return Long.parseLong(String.valueOf(n)
                .chars()
                .mapToObj(ch -> (char) ch)
                .sorted((a, b) -> b.compareTo(a))
                .map(String::valueOf)
                .collect(Collectors.joining()));
    }
}