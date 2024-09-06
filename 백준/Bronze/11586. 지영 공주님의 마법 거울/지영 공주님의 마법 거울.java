import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int N = Integer.parseInt(br.readLine());
			char[][] mirror = new char[N][N];

			for (int i = 0; i < N; i++) {
				mirror[i] = br.readLine().toCharArray();
			}

			int K = Integer.parseInt(br.readLine());

			char[][] result = new char[N][N];

			switch (K) {
				case 1:
					result = mirror;
					break;
				case 2:
					for (int i = 0; i < N; i++) {
						for (int j = 0; j < N; j++) {
							result[i][j] = mirror[i][N - j - 1];
						}
					}
					break;
				case 3:
					for (int i = 0; i < N; i++) {
						result[i] = mirror[N - i - 1];
					}
					break;
			}

			for (int i = 0; i < N; i++) {
				System.out.println(new String(result[i]));
			}
		}
	}
}