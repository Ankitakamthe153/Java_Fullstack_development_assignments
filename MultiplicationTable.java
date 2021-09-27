import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		int n,mul;
		
		System.out.println("Enter number to find the multiplication table of:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		System.out.println("Multiplication table of "+n+" are as follows:");
		for(int i=1;i<=10;i++) {
			mul=i*n;
			System.out.println(mul);
	}
		
	}

}
