import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int num1,num2,option,result;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("My Calculator App");
			System.out.println("-------------------------");
			System.out.println("1. To find Addition");
			System.out.println("2. To find Subtraction");
			System.out.println("3. To find Multiplication");
			System.out.println("4. To find Division");
			System.out.println("0. Exit");
			System.out.println("Please choose option:");
			option=sc.nextInt();
			
			switch (option) {
			case 1: 
				
				System.out.println("Enter a first number:");
				num1=sc.nextInt();
				System.out.println("Enter a second number:");
				num2=sc.nextInt();
				result=num1+num2;
				System.out.println("Addition of "+num1+" and "+num2+" = "+result);
				break;
				
			case 2:
				
				System.out.println("Enter a first number:");
				num1=sc.nextInt();
				System.out.println("Enter a second number:");
				num2=sc.nextInt();
				result=num1-num2;
				System.out.println("Subtraction of "+num1+" and "+num2+" = "+result);
				break;
				
			case 3:
				
				System.out.println("Enter a first number:");
				num1=sc.nextInt();
				System.out.println("Enter a second number:");
				num2=sc.nextInt();
				result=num1*num2;
				System.out.println("Multiplication of "+num1+" and "+num2+" = "+result);
				break;
				
			case 4:
				
				System.out.println("Enter a first number:");
				num1=sc.nextInt();
				System.out.println("Enter a second number:");
				num2=sc.nextInt();
				result=num1/num2;
				System.out.println("Division of "+num1+" and "+num2+" = "+result);
				break;
				
			case 0:
				
				System.out.println("Thank You For Using This App..");
				System.exit(0);
				
			default:
				
				System.out.println("Please choose correct option:");
				break;
			}
		}while(option !=0);
		
	}

}
