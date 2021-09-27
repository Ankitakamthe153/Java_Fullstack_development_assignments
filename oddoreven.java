import java.util.Scanner;
public class oddoreven {
	public static String oddorevennum(int m) {
		if(m%2==0) {
			return "True";
		}else {
			return "False";
		}
	}
	public static void main(String[] args) {
		int n;
		System.out.println("Enter number to check it is odd or even:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		oddoreven.oddorevennum(n);
		
	}
	

}
