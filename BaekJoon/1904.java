import java.util.Scanner;

class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N + 1];

		// 0 , 1 , 2 일 경우 그대로 출력
		if (N < 3) {
			System.out.print(N);
			return;
		} else {
			arr[0] = 0;
			arr[1] = 1;
			arr[2] = 2;
			for (int i = 3; i <= N; i++) {
				// 점화식
				arr[i] = arr[i - 1] + arr[i - 2];
				arr[i] %= 15746;
			}
		}
		System.out.print(arr[N]);
	}
}
