import java.util.Scanner;
public class SalesCommision {
	public static void main(String[] args) {
		int sales;
		double commission,total;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the sales amount:");
		sales=sc.nextInt();
		
		if(sales>0 && sales<=10000)
			commission=sales;
		else if(sales>=1001 && sales<=20000)
			commission=0.1*sales;
		else if(sales>20001 && sales<=30000)
			commission=0.2*sales;
		else 
			commission=0.25*sales;
		
		total=commission+sales;
		
		System.out.println("Sales Amount:"+sales);
		System.out.println("Commission:"+commission);
		System.out.println("Total:"+total);
	}

}
