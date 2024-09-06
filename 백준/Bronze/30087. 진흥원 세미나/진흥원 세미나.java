import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int N = Integer.parseInt(br.readLine());
			Map<String, Integer> map = new HashMap<>();
			map.put("Algorithm", 204);
			map.put("DataAnalysis", 207);
			map.put("ArtificialIntelligence", 302);
			map.put("CyberSecurity", 101);
			map.put("Network", 303);
			map.put("Startup", 501);
			map.put("TestStrategy", 105);

			for (int i = 0; i < N; i++) {
				String subject = br.readLine();
				Integer code = map.get(subject);
				if (code != null && code != 101) {
					System.out.println(code);
				} else {
					System.out.println("B" + code);
				}
			}
		}
	}
}