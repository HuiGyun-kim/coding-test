import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			String str = br.readLine();
			char firstChar = str.charAt(0);
			char lastChar = str.charAt(str.length() - 1);
			sb.append(firstChar).append(lastChar).append("\n");
		}
		System.out.print(sb.toString());
	}
}