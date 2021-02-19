import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 실험실 {
	static int N;
	static int M;
	static int start;
	static int[][] arr;
	static boolean[] check;
	static int count;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N+1][N+1];
		check = new boolean[N+1];
		count = 0;
        
        	//연결 정보 저장
		for(int i = 1 ; i <= M ; i ++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
        	// 간선 전부 탐색
		for(int i = 1 ; i <= N ; i ++) {
			if(dfs(i)) count++;
		}
		
		
		System.out.print(count);
	}
    	// 재귀가 끝날때마다 count ++
	static boolean dfs(int start) {
		if(check[start]) {
			return false;
		}
		else {
			
			check[start] = true;
			for(int i = 1 ; i <= N ; i ++) {
				if(arr[start][i] !=0) {
					dfs(i);
				}
			}
			return true;
		}
	}
	
	
  }
