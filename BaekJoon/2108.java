import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test_2108 {
	public static void main(String[] args) throws Exception {
		int[] count = new int[8002]; //
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");

		int number = Integer.parseInt(bf.readLine()); // 입력의 갯수
		int[][] arr = new int[number][2]; // 최빈값을 구하기 위한 2차원 배열
		int avg = 0; // 산술평균
		int median = 0; // 중앙값을 저장하기 위한 변수
		int range = 0; // 범위를 저장하기 위한 변수
		int sum = 0; // 산술평균을 구하기 위한 sum
		int mode = 0; // 최빈값

		// 입력받는 값이 1개일 경우 처리
		if (number == 1) {
			int n = Integer.parseInt(bf.readLine());
			sb.append(n).append("\n").append(n).append("\n").append(n).append("\n").append(0);
			System.out.println(sb);
			return;
		}

		for (int i = 0; i < number; i++) {
			int n = Integer.parseInt(bf.readLine()); // 숫자
			count[n + 4000]++; // 음수 인덱스를 방지하기 위해 +4000
		}

		int index = 0; //
		int tempCount = 0;

		// i : 입력받은 숫자 count[i] : 빈도수
		for (int i = 0; i < 8001; i++) {
			if (count[i] > 0) {
				sum += (i - 4000);
				arr[index][0] = i - 4000; // 입력받은 숫자 저장
				arr[index][1] += count[i]; // 빈도수 저장
				index++;

				if (tempCount == 0) { // 처음들어온 값 = 최솟값
					range = i - 4000;
				} else if (tempCount == number / 2) { // (2. 중앙값 계산)
					median = i - 4000;
				} else if (tempCount == number - 1) { // 마지막에 들어온 값 - 처음들어온 값 (4. 범위 계산)
					range = i - 4000 - range;
				}
				tempCount++;

				if (--count[i] > 0) { // 빈도수가 남아있으면 다 빠질때 까지 반복
					i--;
					index--;
				}
			}
		}

		// (1. 산술평균 계산)
		if (sum < 0) {
			avg = -(int) (0.5 + (double) -sum / number);
		} else {
			avg = (int) (0.5 + (double) sum / number);
		}

		// 최빈값을 구하기 위해 빈도수로 정렬
		Arrays.sort(arr, (a, b) -> {
			if (a[1] == b[1]) {
				return a[0] - b[0]; // 빈도수대로 정렬하고
			}
			return b[1] - a[1]; // 빈도수가 같으면 값의 오름차순으로 정렬
		});

		// ( 3. 최빈값 계산)
		if (arr[0][1] == arr[1][1]) {
			mode = arr[1][0];
		} else {
			mode = arr[0][0];
		}

		sb.append(avg).append("\n").append(median).append("\n").append(mode).append("\n").append(range);
		System.out.println(sb);

	}
}
