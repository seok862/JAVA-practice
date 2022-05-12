
public class Solution {
	public static void main(String[] args) {
		 int num = 1000000;
		 boolean[] check = new boolean[num+1];
        
         for(int i=2; i <= Math.sqrt(num); i++) {
             for(int j = i*2; j<=num; j = j+i) {
                 check[j] = true;
             }
         }        
          
         for(int i=2; i<=num; i++) {
            if(!check[i]) System.out.print(i+" ");
         }
         System.out.println();
	}
}
