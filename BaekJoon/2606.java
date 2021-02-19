import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 실험실 {
	static int N;
	static int count;
	static int answer = 0;
	static int[][] arr;
	static boolean[] virus;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());  // 컴퓨터 수
		count = Integer.parseInt(br.readLine()); // 
		arr = new int[count+1][2];  // 경로를 저장하는 배열 
		virus = new boolean[N+1];  //감염 여부
		
		for(int i = 1 ; i <= count ; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());			
		}
		
		dfs(1);
		System.out.print(--answer);
	}

	static void dfs(int start) {
		//감염되지 않은 컴퓨터라면
		if(!virus[start]) {
			virus[start] = true;  // 감염시키고
			answer++;  // 감염시킨 갯수 +1
			}else {
				return;  //감염된 컴퓨터라면  return (이전에 감염시키면서 이미 탐색 완료 했음)
			}
		
		// 감염 시작
		for(int i = 1 ; i <= count ; i++) {
			if(arr[i][0] == start) {
				dfs(arr[i][1]);
			}else if(arr[i][1] == start){
				dfs(arr[i][0]);
			}
		}
	}
}
