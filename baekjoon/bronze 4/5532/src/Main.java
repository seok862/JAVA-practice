import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();	//���� �ϼ�
		int A = sc.nextInt();	//���� ������
		int B = sc.nextInt();	//���� ������
		int C = sc.nextInt();	//�Ϸ� �ִ� ���� ������
		int D = sc.nextInt();	//�Ϸ� �ִ� ���� ������

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
