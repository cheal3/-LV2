import java.util.Scanner;
public class Main {
	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);
		String t = s.next();		
		System.out.println(t.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", "T").length());
	}
}
