import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Long n= sc.nextLong();
		Long m = sc.nextLong();

		Long diffNum = Math.abs(n - m);

		System.out.println(diffNum);
	}
}