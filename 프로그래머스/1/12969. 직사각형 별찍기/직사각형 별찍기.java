import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        String star = "*";
        while(cnt < a * b){
            System.out.println(star.repeat(a));
            cnt += a;
        }
    }
}