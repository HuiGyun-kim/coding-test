import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int big = Integer.parseInt(br.readLine()) * 8;
			int small = Integer.parseInt(br.readLine()) * 3;
			System.out.println(big + small - 28);
		}
	}
}