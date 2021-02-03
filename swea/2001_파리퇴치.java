import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_SWEA_2001_파리퇴치_최동욱_D2 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");
		int size , hitSize;
		
		int testCase = Integer.parseInt(br.readLine());
		for(int t = 1 ; t <= testCase ; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			size = Integer.parseInt(st.nextToken());
			hitSize = Integer.parseInt(st.nextToken());
			
			int[][] arr = new int[size][size];
			
			for (int i = 0 ; i < size;  i++) {
				st = new StringTokenizer(br.readLine()," ");
				for (int j= 0 ;j <size ; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			int[] startPoint = new int[2]; // 0 : x  1 : y
			int max = 0;
			while(true) {
				int temp = 0;
				for(int i = 0 ; i < hitSize; i++) {
					for (int j= 0 ;j <hitSize ; j++) {
						temp +=arr[startPoint[0]+i][startPoint[1]+j];											
					}
				}
				max = max <temp ? temp : max;
				if(startPoint[1] == size-hitSize) {
					if(startPoint[0] == size-hitSize) {	
						break;
					}
					startPoint[1] = 0;
					startPoint[0]++;
				}
				startPoint[1]++;
			}//end of While
			sb.append("#").append(t).append(" ").append(max).append("\n");
		}
		System.out.print(sb);
		}
		
	}
