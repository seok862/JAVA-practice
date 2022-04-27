import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int num = 0;
		
		for(int i=1; i<=N; i++) {
			boolean check = true;
			String a = Integer.toString(i);
			
			for(int j=0; j<a.length(); j++) {
				if(!a.substring(j, j+1).equals("4") && !a.substring(j, j+1).equals("7")) {
					check = false;
					break;
				}
			}
			
			if(check) {
				
				num = i;
			}
		}
		
		System.out.println(num);
	}
}
