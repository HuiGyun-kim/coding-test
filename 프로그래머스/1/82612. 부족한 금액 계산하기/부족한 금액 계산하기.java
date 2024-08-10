class Solution {
    public long solution(int price, int money, int count) {
        long totalCost = (long)price * count * (count + 1) / 2;
        long bujokCost = totalCost - money;
        
        return bujokCost > 0 ? bujokCost : 0;
    }
}