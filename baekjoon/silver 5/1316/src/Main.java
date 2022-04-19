import java.util.Scanner;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt = 0;
		
		for (int i=0; i<N; i++) {
			String str = sc.next();
			boolean check[] = new boolean[26];
			boolean temp = true;
			
			for (int j=0; j<str.length(); j++) {
				int index = str.charAt(j)-'a';
				if(check[index]) {
					if(str.charAt(j) != str.charAt(j-1)) {
						temp = false;
						break;
					}
				}else {
					check[index] = true;
				}
			}
			if(temp) cnt++;
		}
		
		System.out.println(cnt);
	}
}