import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		Map<String, Double> gradeToScore = new HashMap<>();
		gradeToScore.put("A+", 4.3);
		gradeToScore.put("A0", 4.0);
		gradeToScore.put("A-", 3.7);
		gradeToScore.put("B+", 3.3);
		gradeToScore.put("B0", 3.0);
		gradeToScore.put("B-", 2.7);
		gradeToScore.put("C+", 2.3);
		gradeToScore.put("C0", 2.0);
		gradeToScore.put("C-", 1.7);
		gradeToScore.put("D+", 1.3);
		gradeToScore.put("D0", 1.0);
		gradeToScore.put("D-", 0.7);

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String rank = br.readLine();
			System.out.println(gradeToScore.getOrDefault(rank, 0.0));
		}
	}
}