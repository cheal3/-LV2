import java.io.BufferedReader;
import java.io.InputStreamReader;

 
public class Test_1874 {
 
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		StringBuilder sb = new StringBuilder();
		int count = Integer.parseInt(br.readLine());	
		int[] stack = new int[count];	
		int index = 0;
		int highest = 0;  //가장많이 push 했던 기록 
		for( int c = 0 ; c < count ; c++) {
			int num = Integer.parseInt(br.readLine());	
			//System.out.println(index);
			if(num > highest) {   
				
				for(int i = highest+1; i <= num; i++) { //가장많이 push 했던 기록 ~ 신기록 까지 push
					stack[index++] = i; //4 4
					sb.append('+').append('\n');
				}
				highest = num; 	//기록 갱신
			} 
			 
			//입력받은 수열의 값을 스택에 쌓지 못하면
			else if(num != stack[index - 1]) {
					System.out.println("NO");
					return ; 
			}
			
			index--;
			sb.append('-').append('\n');			
		
		}
		System.out.println(sb);
	}
 
}
