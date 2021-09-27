import java.util.Scanner;

public class factorial {
	public static int factorial1(int n) {
		if(n==1)
			return 1;
		else
			return (n*factorial1(n-1));
	}
	public static void main(String[] args) {
		int m;
		System.out.println("enter a number to find the factorial:");
		Scanner sc = new Scanner(System.in);
		m=sc.nextInt();
		System.out.println("Factorial of "+m+" is "+factorial1(m));
	}

}
