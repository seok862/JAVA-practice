import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean[] check = new boolean[10001];
		
		int n = 0;
		
		for(int i=1; i<10001; i++) {
			n = i;
			
			int sum = n;
			
			while(n>0) {
				sum += n%10;
				n /= 10;
			}
			
			if(sum <= 10000) {
				check[sum] = true;
			}
		}
		

		for(int j=1; j<check.length; j++) {
			if(!check[j]) {
				System.out.println(j);
			}
		}
	}
}
