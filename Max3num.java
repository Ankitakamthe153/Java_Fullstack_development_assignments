import java.util.Scanner;

public class Max3num {
	public static void max(int n1,int n2,int n3) {
		int temp,largest;
		temp=n1>n2?n1:n2;
		largest=n3>temp?n3:temp;
		System.out.println("The largest number is:"+largest);
	}
	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter the First Number:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		System.out.println("Enter the Second Number:");
		b=sc.nextInt();
		
		System.out.println("Enter the Third Number:");
		c=sc.nextInt();
		
		Max3num.max(a, b, c);
	}

}
