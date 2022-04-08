import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			String str = sc.next();
			
			if(str.length() != 8) {
				  System.out.println("#" + (i+1) + " " + "-1");
			}
			
			String year = str.substring(0,4);
			String month = str.substring(4,6);
			String day = str.substring(6,8);
			
			int monthInt = Integer.parseInt(month);
			int dayInt = Integer.parseInt(day);
			
			if(monthInt > 12 || monthInt == 0) {
				System.out.println("#" + (i+1) + " " + "-1");
			} else if(monthInt == 2) {
				if(dayInt > 28) {
					System.out.println("#" + (i+1) + " " + "-1");
				} else {
					System.out.println("#" + (i+1) + " " + year+"/"+month+"/"+day);
				}
			} else if(monthInt == 1 || monthInt == 3 || monthInt == 5 || monthInt == 7 || monthInt == 8 || monthInt == 10 || monthInt == 12) {
				if(dayInt > 31) {
					System.out.println("#" + (i+1) + " " + "-1");
				} else {
					System.out.println("#" + (i+1) + " " + year+"/"+month+"/"+day);
				}
			} else {
				if(dayInt > 30) {
					System.out.println("#" + (i+1) + " " + "-1");
				} else {
					System.out.println("#" + (i+1) + " " + year+"/"+month+"/"+day);
				}
			}
		}
	}
}
