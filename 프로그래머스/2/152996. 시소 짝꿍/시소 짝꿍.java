import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        Arrays.sort(weights);

        Map<Integer, Integer> map = new HashMap<>();
        for(int weight : weights){
            if(map.containsKey(weight)) answer += map.get(weight);
            if(weight % 2 == 0 && map.containsKey(weight / 2)) answer += map.get(weight / 2);
            if(weight % 3 == 0 && map.containsKey(weight * 2 / 3)) answer += map.get(weight * 2 / 3);
            if(weight % 4 == 0 && map.containsKey(weight * 3 / 4)) answer += map.get(weight * 3 / 4);
            map.put(weight, map.getOrDefault(weight, 0) + 1);
        }
        return answer;
    }
}