import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		int cnt = 0;
		String ans = "";
		for(int i=0; i<st.length(); i++) {
			if(st.substring(i,i+1).equals("X")) {
				cnt++;	
				
				if(cnt == 4) {
					ans += "AAAA";
					cnt = 0;
				}
			}
			else if(st.substring(i,i+1).equals(".")) {
				if(cnt == 2) {
					ans += "BB";
					cnt = 0;
				} else if (cnt == 1 || cnt == 3){
					System.out.println(-1);
					System.exit(0);
				}
				
				if (cnt == 0) {
					ans +=".";
				}
			}
		}
		
		if(cnt == 2) {
			ans += "BB";
		}else if(cnt == 1 || cnt == 3){
			System.out.println(-1);
			System.exit(0);
		}
		
		System.out.println(ans);
	}
}
