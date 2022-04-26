import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[8];
		int cnt = 0;
		
		for(int i=0; i<8; i++) {
			arr[i] = sc.next();
			
			if((i+1)%2 == 1) {
				char[] arr2 = arr[i].toCharArray();
				
				for(int j=0; j<8; j+=2) {
					if(arr2[j] == 'F') {
						cnt++;
					}
				}
			} else {
				char[] arr2 = arr[i].toCharArray();
				
				for(int j=1; j<8; j+=2) {
					if(arr2[j] == 'F') {
						cnt++;
					}
				}
			}
		}
		
		System.out.println(cnt);
		
	}
}
