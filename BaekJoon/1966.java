import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");

		int testCase = Integer.parseInt(br.readLine());

		for (int t = 1; t <= testCase; t++) { // 3
			StringTokenizer st = new StringTokenizer(br.readLine());
			int count = Integer.parseInt(st.nextToken()); // 6
			int wonder = Integer.parseInt(st.nextToken()); // 0
			int h = 0;
		

			Queue<Integer> importance = new LinkedList<Integer>();
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[count];
			for (int i = 0; i < count; i++) {
				int temp = Integer.parseInt(st.nextToken()); // 우선순위
				importance.offer(temp); // 1 1 9 1 1 1
				arr[i] = temp; // 1 1 9 1 1 1 1
			}
			
			Arrays.sort(arr); // 9 1 1 1 1 1
			
			for (int i = count - 1; i >= 0; i--) {
				while (importance.peek() != arr[i]) {
					importance.offer(importance.poll());
					wonder -- ; 	
					if(wonder == -1) {
						wonder = importance.size()-1;
					}

				}
				importance.poll();
				h++;
				if(wonder==0) {
					sb.append(h).append("\n");
				}
				wonder --;
			}

		}
		System.out.print(sb);
	}
}
