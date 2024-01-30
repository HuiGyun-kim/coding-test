class Solution {
    public int solution(int n, int k) {
        int totalCost = n * 12000 + k * 2000;
        int freeDrinks = n / 10;
        totalCost -= freeDrinks * 2000;
        return totalCost;
    }
}