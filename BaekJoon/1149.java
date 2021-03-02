import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N+1][3];
		int[][] distance = new int[N+1][3];
		
		//arr 배열은 해당 인덱스의 비용
		for(int i = 1 ; i <= N ; i ++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
		}
		
		//distance 배열의 원소는  해당 인덱스까지 도달할 수 있는 최소비용 ( 이전 비용의 최솟값 + 현재 비용 )   
		for(int i = 1 ; i <= N ; i++) {
			distance[i][0] = Math.min(distance[i-1][1] , distance[i-1][2]) + arr[i][0];
			distance[i][1] = Math.min(distance[i-1][0] , distance[i-1][2]) + arr[i][2];
			distance[i][2] = Math.min(distance[i-1][0] , distance[i-1][1]) + arr[i][1];
		}
		
		System.out.print(Math.min(Math.min(distance[N][0], distance[N][1]) , distance[N][2]));
	}
}
