import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 실험실 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] coin = new int[N];
		int[] min = new int[K+1];
		int tempMin = 100000;
		Arrays.sort(coin);
        
       		//코인 정보 입력받기
		for(int i = 0 ; i < N ; i ++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
        	// 추후 +1을 하기위해 0을 저장 
		min[0] = 0;

		// i번째 크기의 최솟값을 찾음
		for(int i = 1 ; i<= K ; i ++) {
			tempMin = 100000;
            
			for(int j = N-1 ; j >= 0 ; j--) {
				
                 		//큰 동전부터 시작하여 빼보면서 가장 작은값을 저장 	
				 if(i - coin[j] >=0 ) {  
					  tempMin = tempMin > min[i-coin[j]]+1 ? min[i-coin[j]]+1 : tempMin ;  
					 
				 }
				 min[i] = tempMin; // 없을경우 100000 저장
			}
		}
		
		if(tempMin >= 100000) {
			System.out.print(-1);
		}else {
		System.out.print(min[K]);
		}
	}
	

}
