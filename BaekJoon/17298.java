import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Test_17298 {
	public static void main(String[] args) throws Exception {
		Stack<Integer> stack = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");

		int count = Integer.parseInt(br.readLine());
		int[] arr = new int[count];
		int[] answer = new int[count];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < count; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = count - 1; i >= 0; i--) {
			while (!stack.isEmpty()) {
				if (stack.peek() <= arr[i]) { // 2 <= 5
					stack.pop();
				} else {
					break;
				}
			}		
			if (stack.isEmpty()) {
				answer[i] = -1;
				stack.push(arr[i]);
				continue;
			}
			answer[i] = stack.peek();
			stack.push(arr[i]);
		}

		for (int i = 0; i < count; i++) {
			sb.append(answer[i]).append(" ");
		}
		System.out.print(sb);
	}
}
