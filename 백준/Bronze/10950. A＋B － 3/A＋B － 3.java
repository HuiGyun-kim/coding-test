import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		while(cnt > 0){
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
			cnt--;
		}
		sc.close();
	}
}