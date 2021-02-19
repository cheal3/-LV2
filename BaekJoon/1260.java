import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 실험실 {
	static int N;
	static int M;
	static int start;
	static int[][] arr;
	static boolean[] check;
	static StringBuilder sb;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder("");
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());
		arr = new int[N+1][N+1];
		check = new boolean[N+1];
		for(int i = 0  ; i < M ; i ++) {
			st = new StringTokenizer(br.readLine());
			int x =  Integer.parseInt(st.nextToken());
			int y =  Integer.parseInt(st.nextToken());
			arr[x][y] = 1;
			arr[y][x] = 1;
		}
		
		dfs(start);
		check = new boolean[N+1];
		sb.append("\n");
		bfs(start);
		
		
		System.out.print(sb);
	}
	static void dfs(int start) {
		check[start] = true; 
		sb.append(start).append(" ");
		for(int i = 1 ; i <= N ; i ++) {
			if(arr[start][i]==1 && !check[i]) { //길이 있고 아직 탐색하지 않았으면 계속 탐색
				dfs(i);
			}
		}
	}
	
	static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		check[start] = true;
		queue.offer(start);
		
		//가로 탐색이 끝날때마다 큐에서 꺼냄
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			sb.append(temp).append(" ");
			//길이 있으면 다음 행으로 넘어감
			for(int i = 1 ; i <= N ; i++) {
				if(arr[temp][i] == 1 && !check[i]) {
					check[i] = true;
					queue.offer(i);
					
				}
			}
			
		} //end of while
	}//end of bfs
}
