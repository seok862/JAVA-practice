import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
 
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            long sum = 0;
            int max = 0;
            int[] arr = new int[N];
         
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }
 
            for (int j = N - 1; j >= 0; --j) {
                if (arr[j] > max) {
                    max = arr[j];
                } 
                else {
                    sum += max-arr[j];
                }
                 
            }
            System.out.println("#" + (i + 1) + " " + sum);
        }
    }
}