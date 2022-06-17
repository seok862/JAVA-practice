import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	
    	int result = factorial(N);
    	
    	System.out.println(result);
    }
    
    static int factorial(int N) {
    	
    	if(N > 0) {
    		return factorial(N-1)*N;
    	}
    	
    	return 1;
    }
}