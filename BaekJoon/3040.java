import java.io.BufferedReader;
import java.io.InputStreamReader;


public class 실험실 {
	static int N = 9;
	static int sum;
	static int[] arr;
	static boolean[] check; 
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		arr = new int[N];
		check = new boolean[N];
		for(int i = 0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		comb(0,0);
	}

	static void comb(int index , int count) {
		//System.out.println(index + " " + count);
		if (count == 7) {
			sum = 0;
			for (int i = 0; i < N; i++) {
				if(check[i]) sum+=arr[i];
			}
			if(sum == 100) {
				for (int i = 0; i < N; i++) {
					if(check[i]) System.out.println(arr[i]);
				}

			}
			return;
		}
		
		for( int i = index ; i < N ; i++) {
			if(check[i]) {
				continue;
			}else {
				check[i] = true;
				comb(i+1 , count+1);
				check[i] = false;
			}
		}

	}
	
	
}
