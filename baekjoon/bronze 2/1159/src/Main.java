import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[26];
		
		for(int i=0; i<N; i++) {
			char st = sc.next().charAt(0);
			arr[st-97]++;			
		}
		
		boolean check = false;
		
		for(int i=0; i<26; i++) {
			if(arr[i] >= 5) {
				check = true;
				System.out.print((char)(i+97));
			}
		}
		
		if(!check) System.out.println("PREDAJA");
	}
}
