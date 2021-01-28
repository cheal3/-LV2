import java.util.Scanner;

public class Main {
	static int count = 0;
	static StringBuilder a = new StringBuilder("");
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = 1;
		int notd = 2;
		int destination = 3;
		int n = sc.nextInt();
		hanoi(1,2,3,n);
		System.out.println(count);//  2^count -1
		System.out.println(a);
	}

public static void hanoi(int start ,int notd , int destination , int n) {
	
	if(n == 1) {
		count = 1;
		a.append(start + " " + destination+"\n");
	}else if(n==2) {
		count += 3;
		a.append(start + " " + notd+"\n");
		a.append(start  + " " + destination+"\n");
		a.append(notd  + " " +  destination+"\n");
	}else if( n > 2) {
		int tempN = n -1;
		count += 1;
		hanoi(start,destination,notd,tempN);
		a.append(start + " " + destination+"\n");
		hanoi(notd,start,destination,tempN);
	}

 }
}
