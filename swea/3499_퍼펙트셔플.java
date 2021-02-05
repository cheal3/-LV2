import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder("");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int t = 1; t <= TC; t++) { // tc
			sb.append("#").append(t).append(" ");
			int wordCount = Integer.parseInt(br.readLine());
			String[] s_left = new String[(wordCount / 2) + 1];
			String[] s_right = new String[wordCount / 2 + 1];

			StringTokenizer st = new StringTokenizer(br.readLine());

			int j = 0;
			for (int i = 0; i < wordCount; i++) {
				if (i == wordCount / 2 && wordCount % 2 == 1) {
					s_left[i] = st.nextToken();
				} else if (i < wordCount / 2) {
					s_left[i] = st.nextToken();
				} else {
					s_right[j++] = st.nextToken();
				}
			}
			for (int i = 0; i < wordCount / 2; i++) {
				sb.append(s_left[i]).append(" ").append(s_right[i]).append(" ");
			}
			if (wordCount % 2 == 1) {
				sb.append(s_left[wordCount / 2]);
			}
			sb.append("\n");
		} // end of tc
		System.out.print(sb);
	}
}
