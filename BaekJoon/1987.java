import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 실험실 {
	public static int R, C;
	public static int map[][];
	public static boolean visit[];
	public static int step[][];
	static int dx[] = { 1, 0, -1, 0 };
	static int dy[] = { 0, 1, 0, -1 };
	static int max = 1;
	static int count = 1;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new int[R][C];
		visit = new boolean[26];

		for (int i = 0; i < R; i++) {
			String temp = br.readLine();
			int k = 0;
			for (char c : temp.toCharArray()) {
				map[i][k++] = c;
			}
		}

		dfs(map, visit, 0, 0);
		System.out.println(max);
	}

	public static void dfs(int[][] map, boolean[] visit, int x, int y) {
		visit[map[x][y] - 'A'] = true;
		// 네 방향으로 탐색

		for (int i = 0; i < 4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];

			// 다음 행선지가 범위 안이면
			if (nextX >= 0 && nextY >= 0 && nextX < R && nextY < C) {
				if (!visit[map[nextX][nextY] - 'A']) {
					max = Math.max(++count, max);
					dfs(map, visit, nextX, nextY);

				}
			}
		}

		--count;
		visit[map[x][y] - 'A'] = false;
	}
}
