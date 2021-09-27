import java.util.Scanner;

public class oddoreven1 {
	public static void evenorodd(int n) {
		if(n%2==0) {
			System.out.println(n+" is a even number");
		}else {
			System.out.println(n+" is a odd number");
		}
	}
	
	public static void main(String[] args) {
		int m;
		System.out.println("Enter a number to check whether it is even or odd:");
		Scanner sc = new Scanner(System.in);
		m=sc.nextInt();
		
		oddoreven1.evenorodd(m);
	}

}
