import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 실험실 {
	static int N;
	static int M;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder("");

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		st = new StringTokenizer(br.readLine());
		int temp;
		int[] tempArr ;
		int[][] tempArr2 ;
		for (int i = 0; i < R; i++) {
			int f = Integer.parseInt(st.nextToken());

			switch (f) {
			case 1:
				tempArr = new int[M];
				for (int j = 0; j < N / 2; j++) {
					tempArr = arr[j];
					arr[j] = arr[N - j - 1];
					arr[N - j - 1] = tempArr;
				}
				break;
			case 2:
				tempArr = new int[N];
				for (int j = 0; j < M / 2; j++) {
					for (int k = 0; k < N; k++) {
						tempArr[k] = arr[k][j];
						arr[k][j] = arr[k][M - j - 1];
						arr[k][M - j - 1] = tempArr[k];
					}
				}
				break;
			case 3:
				tempArr2 = new int[M][N];
				for (int j = 0; j < N; j++) {
					for (int k = 0; k < M; k++) {
						//System.out.println(j + " " + k);
						tempArr2[k][N - j - 1] = arr[j][k];
					}
				}
				arr = tempArr2;
				temp = N;
				N = M;
				M = temp;
				break;
			case 4:
				tempArr2 = new int[M][N];
				for (int j = 0; j < N; j++) {
					for (int k = 0; k < M; k++) {
						tempArr2[M-1-k][j] = arr[j][k];
					}
				}
				arr = tempArr2;
				temp = N;
				N = M;
				M = temp;
				break;
				
			case 5:
				tempArr2 = new int[N][M];
				for(int  j = 0 ; j <N ; j++) {
					for(int k = 0 ; k <M ; k++) {
						if( j < N/2 && k < M/2) {   // 1
							tempArr2[j][k] = arr[j+N/2][k];
							
						}else if( j >= N/2 && k < M/2){ // 4
							tempArr2[j][k] = arr[j][k+M/2];
						
						}else if( j >= N/2 && k >= M/2) { // 3
							tempArr2[j][k] = arr[j-N/2][k];
						
						}else if(j < N/2 && k>= M/2) {// 2
							tempArr2[j][k] = arr[j][k-M/2];
				
						}
					}
				}
				arr = tempArr2;
				break;
				
			case 6:
				tempArr2 = new int[N][M];
				for(int  j = 0 ; j <N ; j++) {
					for(int k = 0 ; k <M ; k++) {
						if( j < N/2 && k < M/2) {   // 1
							tempArr2[j][k] = arr[j][k+M/2];
							
						}else if( j >= N/2 && k < M/2){ // 4
							tempArr2[j][k] = arr[j-N/2][k];
						
						}else if( j >= N/2 && k >= M/2) { // 3
							tempArr2[j][k] = arr[j][k-M/2];
						
						}else if(j < N/2 && k>= M/2) {// 2
							tempArr2[j][k] = arr[j+N/2][k];
				
						}
					}
				}
				arr = tempArr2;
				
				break;

			}

		}

		// test
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				sb.append(arr[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}

}
