import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N+1];
		
		for(int i=1; i<N+1; i++) {
			arr[i] = sc.nextInt();
		}
		
		int people = sc.nextInt();
		
		for(int i=0; i<people; i++) {
			int s = sc.nextInt();
			int num = sc.nextInt();
			
			if(s == 1) {
				for(int j=num; j<N+1; j+=num) {
				
					arr[j] = arr[j] == 0 ? 1 : 0;
				}
			}
			
			if(s == 2) {
							
				int left = num-1;
				int right = num+1;
				
				arr[num] = arr[num] == 0 ? 1 : 0;
				
				while(left >=1 && right <=N) {
					if(arr[left] == arr[right]) {
						arr[left] = arr[left] == 0 ? 1 : 0;
	
						arr[right] = arr[right] == 0 ? 1 : 0;

						left--;
						right++;
					}  else	break;
				}
			}
		}
		
		for(int i=1; i<N+1; i++) {
			System.out.print(arr[i]+" ");
			
			if(i%20 == 0) System.out.println();
		}
		
		
	}
}
