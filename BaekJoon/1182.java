import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int S;
	static int[] arr;
	static boolean[] state;
	static int count =0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		arr =  new int[N];
		state = new boolean[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ; i ++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}
		powerset(arr, state, 0, arr.length);
		if(S==0) {
			System.out.print(--count);
		}else {
		System.out.print(count);
		}
		
	}
	
	static void powerset(int[] arr , boolean[] state, int index , int end) {
		if(index>=end) {
			int sum = 0;
			for(int j = 0 ; j < end; j++) {
				if(state[j]) {
					sum+=arr[j];
				}
			}
			if(sum == S) {
				count++;
			}
			
			return;
		}
		state[index]=false;
		powerset(arr,state,index+1,end);
		
		state[index]=true;
		powerset(arr,state,index+1,end);
		
	}

}
