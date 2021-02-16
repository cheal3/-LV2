import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 실험실 {
	static int N;
	static int count = 0;
	static int[] queen;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		queen = new int[N]; // index = 행 / 값 = 열
		search(0, 0);
		System.out.println(count);
	}


	static void search(int row, int fixed) {
    		//전부 배치가 완료되면 count 증가
		if (fixed == N) {
			count++;
		} else {
			//row는 현재 배치중인 행  i는 열
			for (int i = 0; i < N; i++) { 
				queen[row] = i;
				if (check(row)) {
					search(row + 1, fixed + 1);
				}
			}

		}
	}

	//해당 배치가 유효한지 체크
	static boolean check(int row) {

		for (int j = 0; j < row; j++) { // j 는 이전 행들을 검사

			// 해당 열에 다른 퀸이 존재하는지??
			if (queen[row] == queen[j]) {
				return false;
			}
			// 대각선상에 다른 퀸이 존재하는지??
			if (Math.abs(queen[j] - queen[row]) == Math.abs(row - j)) {
				return false;
			}
		}
		return true;
	}

}
