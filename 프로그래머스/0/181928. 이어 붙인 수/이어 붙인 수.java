class Solution {
    public int solution(int[] num_list) {
        String even = "";
        String odd = "";
        for (int num : num_list) {
            if (num % 2 == 0) {
                even += num;
            } else {
                odd += num;
            }
        }
        
        int evenNumber = even.isEmpty() ? 0 : Integer.parseInt(even);
        int oddNumber = odd.isEmpty() ? 0 : Integer.parseInt(odd);

        return evenNumber + oddNumber;
        
    }
}