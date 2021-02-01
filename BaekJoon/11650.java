import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test_11650 {
	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");
		StringTokenizer st;
	
		int number = Integer.parseInt(bf.readLine()); //입력의 갯수
		int[][] arr = new int[number][2];
		
		for(int i = 0 ; i <number ; i++) { //좌표 입력 받기
			st = new StringTokenizer(bf.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());		
		}
		
		Arrays.sort(arr , (a,b) -> {  // 2차원 배열은 그냥 sort하면 에러남
			if(a[0] == b[0]) { // x 좌표가 같으면 
				return a[1] - b[1];  //y의 오름차순
			}else{
				return a[0] - b[0]; // x좌표가 다르면 x의 오름차순
			}
			});
		
		for (int i = 0 ; i < number ; i++){
			sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n"); // append는 한번에 쓰지 않기
		}
		System.out.print(sb);
	}
}
