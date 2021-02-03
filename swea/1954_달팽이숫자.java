import java.util.Scanner;

public class Main_SWEA_1954_달팽이숫자 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		StringBuilder sb = new StringBuilder("");
		for (int i = 1 ;  i <= testCase ; i++) {
			sb.append("#").append(i).append("\n");
			int count = sc.nextInt();
			int[][] arr = new int[count][count];
			int num = 1;
			int direction = 2;  // 1 2 3 4  위 오른 아래 왼
			int x = 0; // x 좌표
			int y = 0; // y 좌표
			for (int j = 0 ; j < Math.pow(count, 2) ; j++) {
					arr[x][y] = num++;
					switch(direction) {
						case 1:
							if(y==0 || arr[x][y-1] !=0 ) { // 끝이면
								direction = 2;  //방향전환
						
								x++;
							}else {
								y--;
							}	
							break;
						case 2:
							if(x== (count-1) || arr[x+1][y] !=0 ) {
								direction = 3;
								y++;
							}else {
								x++;
							}
							break;
						case 3:
							if(y == (count-1) || arr[x][y+1] !=0 ) {
								direction = 4;
								x--;
							}else {
								y++;
							}
							break;
						case 4:
							if(x == 0 || arr[x-1][y] !=0 ) {
								direction = 1;
								y--;
							}else {
								x--;
							}
							break;	
				}//end of switch
			} // end of for loop
			for (int j = 0 ; j < count ; j++) {
				for (int k = 0 ; k < count ; k++) {
					sb.append(arr[k][j]).append(" ");
				}
				sb.append("\n");
			}
			
			}//end of for loop 
		System.out.print(sb);
		
		}
		
		
	}
