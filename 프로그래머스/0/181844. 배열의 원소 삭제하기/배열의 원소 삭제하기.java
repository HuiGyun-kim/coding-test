import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> deleteSet = new HashSet<>();
        for (int num : delete_list) {
            deleteSet.add(num);
        }

        List<Integer> tempList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!deleteSet.contains(arr[i])) {
                tempList.add(arr[i]);
            }
        }

        int[] answer = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            answer[i] = tempList.get(i);
        }

        return answer;
    }
}