import java.util.PriorityQueue;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> minPq = new PriorityQueue<>();
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(String op : operations){
            StringTokenizer st = new StringTokenizer(op);
            String judge = st.nextToken();
            int value = Integer.parseInt(st.nextToken());
            
            if(minPq.size() == 0 && judge.equals("D")){
                continue;
            }
            
            if(judge.equals("I")){
                minPq.add(value);
                maxPq.add(value);
            }
            else if(value == 1){
                int max = maxPq.remove();
                minPq.remove(max);
            }
            else if(value == -1){
                int min = minPq.remove();
                maxPq.remove(min);
            }
        }
        if(!minPq.isEmpty()){
            answer[0] = maxPq.remove();
            answer[1] = minPq.remove();
        }
        return answer;
    }
}