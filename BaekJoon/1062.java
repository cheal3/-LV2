import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 실험실 {
    static int N;
    static int K;
    static int count = 0 ;
    static boolean[][] word;
    static boolean[] visit = new boolean[26];;

    public static void main(String[] args) throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 단어의 개수
        K = Integer.parseInt(st.nextToken()); // 가르치는 글자의 수      
        if(K < 5) {
        	System.out.print(0);  // a n t i c    5개는 필수적으로 들어감
        	return ;
        }
        word = new boolean[N][26]; 
        
        // 단어별 쓰인 알파벳을 저장
        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            for (char c : temp.toCharArray()) {
                word[i][c - 'a'] = true;
            }
        }
        
        perm(0, 0);
        System.out.print(count);
    }

    private static void perm(int index, int depth) {
    	
    	//가르칠 수 있는 최대 글자가 되면 
        if (depth == K) {
            check();  
            return;
        }
        
        for (int i = index; i < 26; i++) {
            if (!visit[i]) {
                visit[i] = true;
                perm(i, depth + 1);
                visit[i] = false;
            }
        }

    }

    private static void check() {
        int max = 0;
        boolean b ;
        for (int i = 0; i < N; i++) {
        	b= true;
            for (int j = 0; j < 26; j++) {
                if (word[i][j] && !visit[j]) { //모르는 글자가 있으면 break
                	b= false;
                    break;
                }
            }
            if(b) max++;
        }

        count = Math.max(max, count);
    }
}
