import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] input = br.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			int A = Integer.parseInt(input[1]);
			int B = Integer.parseInt(input[2]);

			int busTime = A;
			int subwayTime = Math.max(N, B);

			if (busTime < subwayTime) {
				System.out.println("Bus");
			} else if (busTime > subwayTime) {
				System.out.println("Subway");
			} else {
				System.out.println("Anything");
			}
		}
	}
}