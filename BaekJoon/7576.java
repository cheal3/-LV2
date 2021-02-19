import java.util.Queue;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class 실험실 {
	public static int M, N;
	public static int map[][];
	public static boolean visit[][];
	static int dx[] = { 1, 0, -1, 0 };
	static int dy[] = { 0, 1, 0, -1 };
	static Queue<Integer> queueX = new LinkedList<Integer>();
	static Queue<Integer> queueY = new LinkedList<Integer>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		visit = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				// 익은 토마토가 있을 경우 큐에 추가
				if (map[i][j] == 1) {
					queueX.add(i);
					queueY.add(j);
				}
			}
		}
		bfs();
	}

	public static void bfs() {
		int result = 0;
		int x, y;

		while (!queueX.isEmpty() && !queueY.isEmpty()) {
			x = queueX.poll();
			y = queueY.poll();
			visit[x][y] = true;
			// 네 방향으로 탐색
			for (int i = 0; i < 4; i++) {
				int nextX = x + dx[i];
				int nextY = y + dy[i];
				// 다음 행선지가 범위 안이면
				if (nextX >= 0 && nextY >= 0 && nextX < N && nextY < M) {
					if (map[nextX][nextY] == 0) {  //안익은 토마토 발견
						queueX.add(nextX);
						queueY.add(nextY);
						visit[nextX][nextY] = true;
						map[nextX][nextY] = map[x][y] + 1;
						result = map[nextX][nextY];
					}
				}
			}
		}

		//안익은 토마토가 있으면 
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 0) {
					System.out.print(-1);
					return;
				}
			}
		}
		if (result > 0)
			result--;
		System.out.print(result);

	}

}
