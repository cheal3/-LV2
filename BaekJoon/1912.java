import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];

		int max = Integer.MIN_VALUE ;
        
        	
		for(int i = 0 ; i < N ; i ++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
        
        	//누적 합 
		int cum = 0 ;
        	//누적합을 계산함 누적합이 음수가 되면 0으로 초기화 ( 볼 필요도 없음 => 새로운 시작)
		for(int i = 0 ; i <N ; i ++) {
			if(cum < 0) {
			cum = 0;
			}
			cum+=arr[i];
			
			if(max < cum) max = cum;
		}
	
		System.out.println(max);
		
	}
	

}
