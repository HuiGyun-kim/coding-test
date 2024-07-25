class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
		String str = String.valueOf(x);
		int[] arr = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
			sum += arr[i];
		}
		if (x % sum != 0) {
			answer = false;
		}
        return answer;
    }
}