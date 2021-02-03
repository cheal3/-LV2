import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_2805 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");
		int testCase = Integer.parseInt(bf.readLine());
		for(int t = 1 ; t <= testCase ; t++) {
		int size = Integer.parseInt(bf.readLine());
		int space = size/2;
		int sum = 0;
		boolean isZero = false;
		for(int i = 0 ; i < size ; i ++ ) { // 행
			String s = bf.readLine();
			for(int j = 0 ; j <size ; j++) { // 열
				
				if(j <space || j > size-space-1) {
					continue;
				}
				sum+=s.charAt(j)-'0';
				//System.out.println(s.charAt(j));
			}

			if(space == 0 ) {
				isZero = true;
			}
			space += isZero? 1 : -1; 
			
		}
		sb.append("#").append(t).append(" ").append(sum).append("\n");
		}
		System.out.print(sb);	
		}
}
