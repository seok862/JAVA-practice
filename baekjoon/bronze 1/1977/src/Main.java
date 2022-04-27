import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int num = 1;
		int sum = 0;
		int cnt = 0;
		int min = Integer.MAX_VALUE;
		
		
		while(true) {
			if(num*num >=M && num*num <=N) {
				cnt++;
				sum += num*num;
				
				if(num*num < min) {
					min = num*num;
				}
			}
			
			num++;
			
			if(num*num > N) {
				break;
			}
		}
		if(cnt == 0) {
			System.out.println("-1");
		} else {	
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
