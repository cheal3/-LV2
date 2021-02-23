import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 실험실 {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder("");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int[][] field = new int[101][101];
		int[] ans = new int[N + 1];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int startX = Integer.parseInt(st.nextToken());
			int startY = Integer.parseInt(st.nextToken());
			int width = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());

			for (int x = startX; x < startX + width; x++) {
				for (int y = startY; y < startY + height; y++) {
					field[x][y] = i + 1;
				}
			}
		}

		for (int x = 0; x < 101; x++) {
			for (int y = 0; y < 101; y++) {
				if (field[x][y] != 0)
					ans[field[x][y]]++;
			}
		}
		for(int i = 1 ; i <=N ; i++) {
			sb.append(ans[i]).append("\n");
		}
		System.out.print(sb);

	}
}
