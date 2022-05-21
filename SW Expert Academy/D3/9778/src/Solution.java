import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
         
        for(int t=1; t<=T; t++) {
            int N = sc.nextInt();
            int sum = 0;
             
            int[] arr = {0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 16, 4};
             
            for(int i=0; i<N; i++) {
                int num = sc.nextInt();
                arr[num]--;
                sum += num; 
            }
             
            int all = 52-N;
            int cnt = 0;
             
            for(int j=2; j<12; j++) {
                if(j <= 21-sum) {
                    cnt += arr[j];
                }
            }
             
            if(cnt > all-cnt) System.out.println("#"+t+" GAZUA");
            else System.out.println("#"+t+" STOP");
        }
    }
}