import java.util.Scanner;

public class EmployeeSalary {
	public static void main(String[] args) {
		int EmployId;
		String EmployName;
		float BasicSalary;
		double hra,pf,ta,esi,grosspay,netpay;
		
		System.out.println("Enter Employ Id: ");
		Scanner s = new Scanner(System.in);
		EmployId=s.nextInt();
		
		System.out.println("Enter Employ Name: ");
		EmployName=s.next();
		
		System.out.println("Enter Basic Salary:");
		BasicSalary=s.nextFloat();
		
		hra=0.02*BasicSalary;
		
		pf=0.03*BasicSalary;
		
		ta=0.01*BasicSalary;
		
		esi=0.025*BasicSalary;
		
		grosspay=BasicSalary+hra+pf+esi+ta;
		
		netpay=grosspay-pf;
		
		System.out.println("    Salary Break Up Application");
		System.out.println("..........................................");
		System.out.println("Employ Id        :"+EmployId);
		System.out.println("Employ Name      :"+EmployName);
		System.out.println("Basic Salary     :"+BasicSalary);
		System.out.println("HRA              :"+hra);
		System.out.println("PF               :"+pf);
		System.out.println("TA               :"+ta);
		System.out.println("ESI              :"+esi);
		System.out.println("Gross Pay        :"+grosspay);
		System.out.println("Net Pay          :"+netpay);
		
		
		
		
		
	}

}
