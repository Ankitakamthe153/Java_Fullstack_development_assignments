import java.util.Scanner;

public class EligibleToVote {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter the Age:");
		Scanner sc = new Scanner(System.in);
		age=sc.nextInt();
		sc.close();
		if(age>=18)
		{
			System.out.println("Eligible to Vote");
		}
		else
		{
			System.out.println("Not Eligible to Vote");
		}
	}

}
