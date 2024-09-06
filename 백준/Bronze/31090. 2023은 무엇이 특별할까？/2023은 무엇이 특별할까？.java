import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int T = Integer.parseInt(br.readLine());
			for (int i = 0; i < T; i++) {
				int N = Integer.parseInt(br.readLine());
				String s = String.valueOf(N);
				String sub = s.substring(s.length() - 2, s.length());
				System.out.println((N + 1) % Integer.parseInt(sub) == 0 ? "Good" : "Bye");
			}
		}
	}
}