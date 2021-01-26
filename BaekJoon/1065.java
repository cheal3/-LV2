import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 99; 
		int tempI = 0;  
		int tempILen = 0;
		int temp = 0;
		int temp2 = 0;
		int diff = 10;
		int input = 0 ;		
		input = sc.nextInt();
		
		// 100 이하의 수는 모두 조건을 만족 
		if(input < 100) {
			System.out.println(input);  
			return ;
		// 100보다 큰 입력이 들어올 경우
		}else {
			for (int i = 100 ; i <= input ; i++) {
				diff = 10; 
				tempI = i; 
				temp = tempI%10; // 일의 자리
				tempI /= 10;  // 일의 자리 제거
				tempILen = (int)Math.log10(tempI);
				for (int j = 0 ; j <= tempILen ; j++) {					
					temp2 = tempI%10; // 십의 자리
					tempI /= 10; //십의 자리 제거
					if(diff != 10) {  //diff에 값이 들어가 있고
						if(diff != temp-temp2) { // 공차가 다르면
							count --;
							break;
						}
					}
					diff = temp-temp2;
					temp = temp2;
					
				}
				count ++;
				
			}
			
		}
		System.out.println(count);
	}
}
