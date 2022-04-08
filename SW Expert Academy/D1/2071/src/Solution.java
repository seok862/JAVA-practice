import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
         
        for(int i=0; i<T; i++) {
            double sum = 0;
            for(int j=0; j<10; j++) {
                int N = sc.nextInt();
                sum += N;
            }
            System.out.println("#"+(i+1)+" "+Math.round(sum/10));
        }
    }
}