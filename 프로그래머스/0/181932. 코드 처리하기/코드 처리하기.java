class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        boolean mode = false;

        for (int idx = 0; idx < code.length(); idx++) {
            char ch = code.charAt(idx);
            if (ch == '1') {
                mode = !mode;
            } else {
                if (!mode && idx % 2 == 0) {
                    ret.append(ch);
                } else if (mode && idx % 2 == 1) {
                    ret.append(ch);
                }
            }
        }

        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }
}