import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int cnt = 0;
		
		int i,j,k;
		for(i=1; i<=N-2; i++) {
			for(j=i+1; j<=N-1; j++) {
				for(k=j+1; k<=N; k++) {
					cnt++;
				}
			}
		}
		String[] arr = new String[cnt];
		
		int index = 0;
		
		for(i=1; i<=N-2; i++) {
			for(j=i+1; j<=N-1; j++) {
				for(k=j+1; k<=N; k++) {
					arr[index] = Integer.toString(i)+Integer.toString(j)+Integer.toString(k);
					index++;
				}
			}
		}
		
		for(i=0; i<M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			for(j=0; j<arr.length; j++) {
				if(arr[j].contains(Integer.toString(a)) && arr[j].contains(Integer.toString(b))) {
					arr[j] = "";
					cnt--;
				}
			}
		}
		
		System.out.println(cnt);
	}
}
