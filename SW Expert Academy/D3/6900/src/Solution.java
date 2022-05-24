import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int T = sc.nextInt();
        for(int t=1; t<=T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            String[] arr = new String[N];
            int[] arr1 = new int[N];
            for(int i=0; i<N; i++) {
                arr[i] = sc.next();
                arr1[i] = sc.nextInt();
            }
            int sum = 0;
            for(int i=0; i<M; i++) {
                String n = sc.next();
             
                 
                for(int j=0; j<N; j++) {
                    boolean check = true;
                    for(int k=0; k<n.length(); k++) {
                        if(arr[j].substring(k, k+1).equals("*")) continue;
                         
                        if(!arr[j].substring(k, k+1).equals(n.substring(k, k+1))) {
                            check = false;
                            break;
                        }
                    }
                     
                    if(check) sum += arr1[j];
                }
            }
             
            System.out.println("#"+t+" "+sum);
        }
    }
}