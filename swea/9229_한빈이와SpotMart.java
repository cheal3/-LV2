import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder("");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int TC = Integer.parseInt(br.readLine());
        for (int t = 1; t <= TC; t++) {
            sb.append("#").append(t).append(" ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken()); // 과자의 갯수
            int max = Integer.parseInt(st.nextToken());
            int[] snack = new int[count];
            int underMax = -1;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < count; i++) {
                snack[i] = Integer.parseInt(st.nextToken());
            }
 
            for (int i = count - 1; i > 0; i--) {
                for (int j = i - 1; j >= 0; j--) {
                    if (snack[i] + snack[j] <= max && underMax < snack[i] + snack[j] ) {
                        underMax = snack[i] + snack[j];
                        if (underMax == max) {
                            i = -1;
                            j = -1;
                        }
                    }
 
                }
 
            }
            sb.append(underMax).append("\n");
        }
        System.out.print(sb);
 
    }
}
