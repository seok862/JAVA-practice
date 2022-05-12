import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] arr = new String[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.next();
		}
		
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				if(arr[i].length() > arr[j].length()) {
					String tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				if(arr[i].length() == arr[j].length()) {
					for(int k=0; k<arr[i].length(); k++) {
						if(arr[i].charAt(k)-'0' != arr[j].charAt(k)-'0') {
							if(arr[i].charAt(k)-'0' > arr[j].charAt(k)-'0') {
								String tmp = arr[i];
								arr[i] = arr[j];
								arr[j] = tmp;
								break;
							}
							else break;
						} 
					}
				}
			}
		}
		for(int i=0; i<N-1; i++) {
			if(arr[i] == null) continue;
			for(int j=i+1; j<N; j++) {
				if(arr[i].equals(arr[j])) arr[j] = null;
			}
		}
		
		for(int i=0; i<N; i++) {
			if(arr[i] == null) continue;
			System.out.println(arr[i]);
		}
	}
}
