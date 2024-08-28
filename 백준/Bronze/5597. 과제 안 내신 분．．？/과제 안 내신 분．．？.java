import java.util.Scanner;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashSet<Integer> students = new HashSet<>();
		for (int i = 1; i <= 30; i++) {
			students.add(i);
		}

		for (int i = 0; i < 28; i++) {
			int num = sc.nextInt();
			students.remove(num);
		}

		for (int student : students) {
			System.out.println(student);
		}

		sc.close();
	}
}