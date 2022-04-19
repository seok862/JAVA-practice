import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int cnt = 0;
		
		for(int i=0; i<str.length()-1; i++) {
				if(str.substring(i, i+2).equals("c=") || str.substring(i, i+2).equals("c-") || str.substring(i, i+2).equals("d-") || str.substring(i, i+2).equals("lj") || str.substring(i, i+2).equals("nj") || str.substring(i, i+2).equals("s=") || str.substring(i, i+2).equals("z=")) {
					cnt++;
				}
		}
		for(int i=0; i<str.length()-2; i++) {
			if(str.substring(i, i+3).equals("dz=")) {
				cnt++;
			}
		}
		
		
		System.out.println(cnt);
		System.out.println(str.length()-cnt);
	}
}
