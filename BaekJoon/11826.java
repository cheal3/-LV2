import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class 실험실 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("");
        
        // 절댓값이 낮을수록 우선순위가 높아지도록 재 정의
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((element1 , element2) -> {
        	if(Math.abs(element1) == Math.abs(element2)) {
        		return element1 < element2 ? -1 : 1;  
        	}
        	return Math.abs(element1)-Math.abs(element2);
        });
        
        int N = Integer.parseInt(br.readLine());
        
        int x;   
    
        while (N-- > 0) {
            x = Integer.parseInt(br.readLine());
            if (x != 0) { 
            	pq.offer(x);
            } else if(pq.isEmpty()){    //x가 0이고 배열이 비어있는 경우
            	sb.append("0").append("\n");
            }else { 	// x가 0일 경우  배열에서 제거하고 출력
            	sb.append(pq.poll()).append("\n");
            }
        }
        System.out.print(sb);
    }
}
