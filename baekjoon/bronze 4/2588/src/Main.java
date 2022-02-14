import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = b%10;
        int d = (b%100)/10;
        int e = b/100;
        int f = a*b;
        
        System.out.println(c*a);
        System.out.println(d*a);
        System.out.println(e*a);
        System.out.println(f);
    }
}