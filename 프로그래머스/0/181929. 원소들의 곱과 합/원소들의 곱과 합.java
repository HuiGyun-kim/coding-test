class Solution {
    public int solution(int[] num_list) {
      int answer = 0;
      int gop = 1;
      for (int i = 0; i < num_list.length; i++) {
          answer += num_list[i];
          gop *= num_list[i];
      }
        int jegop = (int) Math.pow(answer, 2);
        if (gop < jegop) {
            return 1;
        } else {
            return 0;
        }
    }
}