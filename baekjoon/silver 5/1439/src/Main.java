import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		
		int cnt = 1;
		
		for(int i=0; i<st.length()-1; i++) {
			if(Integer.parseInt(st.substring(i, i+1)) != Integer.parseInt(st.substring(i+1, i+2))){
				cnt++;
			}
		}
		
		int ans = 0;
		
		if(cnt%2 == 0) {
			ans = cnt/2;
		} else {
			ans = (cnt-1)/2;
		}
		
		System.out.println(ans);
	}
}
