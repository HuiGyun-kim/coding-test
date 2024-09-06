import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			long n = Long.parseLong(br.readLine());
			double side = Math.sqrt(n);
			double meter = 4 * side;
			System.out.printf("%.8f%n", meter);
		}
	}
}