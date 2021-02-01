import java.util.Scanner;

class Solution{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++){
			char[] c = sc.next().toCharArray();
            		char temp = '0';
            		int count = 0;
            		for(int i = 0 ; i < c.length ; i++){
                		if(c[i] != temp){
	                   	 temp =c[i];
    	                  	 count ++;
                		}
			}
             System.out.println("#"+test_case  + " " + count);
		}
	}
}
