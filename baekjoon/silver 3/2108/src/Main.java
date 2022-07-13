import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int num = 8001;
		int[] arr = new int[N];
		
		double sum = 0;
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		System.out.println(Math.round(sum/N));
		
		Arrays.sort(arr);
		
		if(N%2 == 0) System.out.println(arr[N/2-1]);
		else System.out.println(arr[N/2]);
		
		int[] arr2 = new int[num];
		
		for(int i=0; i<N; i++) {
			arr2[arr[i]+4000]++;
		}
		
		int cnt = 0;
		int index = 0;
		boolean check = true;
		for(int i=1; i<num; i++) {
			if(arr2[i] > cnt) {
				cnt = arr2[i];
				index = i;
			}
		}
		
		int count = 0;
		
		for(int i=1; i<num; i++) {
			if(arr2[i] == cnt) {
				count++;
			}
		}
		
		if(count == 1) System.out.println(index-4000);
		else {
			ArrayList<Integer> list = new ArrayList<>();
			
			for(int i=0; i<arr2.length; i++) {
				if(arr2[i] == cnt) list.add(i-4000);
			}
			System.out.println(list.get(1));
		}
		
		System.out.println(arr[arr.length-1]-arr[0]);
	}
}