import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Test_1181 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");

		int n = Integer.parseInt(bf.readLine());
		String[] a = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = bf.readLine();
		}

		Set<String> set = Arrays.stream(a).collect(Collectors.toSet());
		String[] newArray = new String[set.size()];
		set.toArray(newArray);

		Arrays.sort(newArray, (s1, s2) -> {
			if (s1.length() == s2.length()) {
				return s1.compareTo(s2);
			}
			return s1.length() - s2.length();
		});

		for (int i = 0; i < newArray.length; i++) {
			sb.append(newArray[i]).append("\n");
		}
		System.out.print(sb);
	}
}
