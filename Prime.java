import java.util.Scanner;

public class Prime {
	public static void primenum(int n) {
		int i,m=0,flag=0;
		m=n/2;
		if(n==0 || n==1) {
			System.out.println(n+" is not a prime number.");
		}else {
			for(i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.println(n+" is not a prime number.");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(n+" is a prime number.");
			}
		}
	}
	public static void main(String[] args) {
		int a;
		System.out.println("Enter a number to check it is a prime number or not:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		Prime.primenum(a);
		
	}

}
