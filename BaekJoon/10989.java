import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		int[] count = new int[10001]; // 10000보다 작거나 같은 자연수
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");
		int number = Integer.parseInt(bf.readLine()); //입력의 갯수
		
		//int temp = 0; 
		for( int i = 0 ; i < number ; i++) {
			int n = Integer.parseInt(bf.readLine()); //숫자
			//temp = temp < n ? n :temp; 
			count[n]++;
		}
		for( int i = 1 ; i < 10001 ; i++) {
			for( int j = 0 ; j < count[i] ; j++) {
				sb.append(i+"\n");
			}
		}
		System.out.println(sb);
	}
}
