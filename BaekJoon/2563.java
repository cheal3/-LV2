	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.util.StringTokenizer;
	
	public class Main {
		public static void main(String[] args) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int count = Integer.parseInt(br.readLine());
			boolean[][] location = new boolean[101][101];
			int x;
			int y;
			int area = 0;		
			for ( int i = 0 ; i < count ; i ++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				x = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());			
				for(int X = x ; X < x+10 ; X++) {
					for(int Y = y ; Y < y+10 ; Y++) {
						if(location[X][Y] == false) {
							location[X][Y] = true;			
							area++;
						}
					}
				}
				
			}
			System.out.print(area);
		}
	
	}
