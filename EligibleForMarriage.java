import java.util.Scanner;

public class EligibleForMarriage {
	public static void main(String[] args) {
		int age;
		String gender;
		System.out.println("Enter the gender:");
		Scanner sc = new Scanner(System.in);
		gender=sc.next();
		
		System.out.println("Enter the age:");
		age=sc.nextInt();
		
		if(gender.equalsIgnoreCase("male") && age>=25) {
				System.out.println("Eligible for Marriage");
		}
		else if(gender.equalsIgnoreCase("female")  && age>=21) {
			System.out.println("Eligible for Marriage");
		}
		else {
			System.out.println("Not Eligible for Marriage");
		}
	}

}
