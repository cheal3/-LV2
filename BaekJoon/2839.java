import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 실험실 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 0;

		while (N >= 3) {
			if (N % 5 == 0) {
				count += N / 5;
				N = 0;
				break;
			}
			N -= 3;
			count++;

		}
		if (N != 0) {
			System.out.print(-1);
			return;
		}
		System.out.println(count);

	}

}
