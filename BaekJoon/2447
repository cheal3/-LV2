import java.util.Arrays;
import java.util.Scanner;

public class Test_2447 {
	
	static char array[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();	
		array = new char[input][input];
		
		for(int i=0; i<array.length;i++) {
			Arrays.fill(array[i], ' ');
		}		
		starmaker(0,0,input);		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
	}
	
	static void starmaker(int x, int y, int size) {	
		//System.out.println("x값 : " + x+  " y 값 : " + y+ " 만들고 있는 사이즈: " + size);
			
		if(size==1) {
			array[x][y] = '*';	
			return;
		}
		size /= 3;
		
		for(int i=0;i<3;i++) {		
			for(int j=0;j<3;j++) {
				if(i==1&&j==1) continue;	
				starmaker(x+(size*i),y+(size*j),size);	
			}
		}		
	}
}
