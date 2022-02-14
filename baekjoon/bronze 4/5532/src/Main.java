import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();	//방학 일수
		int A = sc.nextInt();	//국어 페이지
		int B = sc.nextInt();	//수학 페이지
		int C = sc.nextInt();	//하루 최대 국어 페이지
		int D = sc.nextInt();	//하루 최대 수학 페이지

		int num = 0;
		if(A/C >= B/D) {
			if(A%C == 0) {
				System.out.println(L-(A/C));
			}
			if(A%C != 0) {
				System.out.println(L-((A/C)+1));
			}
		}
		if(A/C < B/D) {
			if(B%D ==0) {
				System.out.println(L-(B/D));
			}
			if(B%D != 0) {
				System.out.println(L-((B/D)+1));
			}
		}

	}
}
