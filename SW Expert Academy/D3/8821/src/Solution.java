import java.util.Scanner;

public class Solution{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for(int t=1; t<=T; t++){
            String str = sc.next();
            
            int[] arr = new int[str.length()];
            
            for(int i=0; i<str.length(); i++) {
            	arr[i] = str.charAt(i)-'0';
            }
            
            int[] index = new int[10];
            
            for(int i=0; i<arr.length; i++) {
            	if(index[arr[i]] == 1) {
            		index[arr[i]] = 0;
            	} else if(index[arr[i]] == 0){
            		index[arr[i]] = 1;
            	}
            }
            
            int cnt = 0;
            
            for(int i=0; i<index.length; i++) {
            	if(index[i] == 1) {
            		cnt++;
            	}
            }
            
            System.out.println("#"+t+" "+cnt);
        }
    }
}
