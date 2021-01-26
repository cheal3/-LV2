public class Main {
	public static void main(String[] args) {
	boolean num[] = new boolean[10000+1];
	int eachSum = 0;
	int tempI = 0 ;
	for (int i = 1 ; i <= 10000 ; i++) {
		eachSum = 0;
		
		if(num[i] == false) {
			System.out.println(i);
		}
		
		tempI = i;
		for(int j = (int)(Math.log10(i)) ; j >= 0; j --) {		
			eachSum +=  (tempI / Math.pow(10, j)) ;
			tempI = (int) (tempI % Math.pow(10, j));
		
		}
		if( (eachSum + i ) <= 10000) {
			num[eachSum+i] = true ;
		}
		
		}
		
	}
}
