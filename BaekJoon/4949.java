import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Exception;
 
public class Main {
 
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String text;
		
		while (true) {
			text = br.readLine();
			if (text.equals(".")) {
				break;
			}
			char[] stack = new char[text.length()];
			int count = 0;
			for(char c : text.toCharArray()) {
				if(c == '('  ) {
					stack[count++] = '(';
				}else if(c == ')') {
					if(count >= 1 && stack[count-1] == '(' ) {
						count --;
					}else {
						count = -1;
						break;
					}
				}else if(c == '['  ) {
					stack[count++] = '[';
				}else if(c == ']') {
					if(count >= 1 && stack[count-1] == '[') {
						count --;
					}else {
						count = -1;
						break;
					}
				}
			}
			if(count ==0) {
				sb.append("yes").append('\n');
			}else {
				sb.append("no").append("\n");
			}
			
		}
 
		System.out.println(sb);
	}
}
