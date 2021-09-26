import java.util.Scanner;

public class scan {
	public static void main(String[] args) {
		int StudId,Subject1,Subject2,Subject3,Subject4,Subject5,Subject6;
	    String fname,lname;
	    float total,average;
	    
	    System.out.println("Enter Student Id:");
	    Scanner s =new Scanner(System.in);
	    StudId=s.nextInt();
	    
	    System.out.println("Enter Student first name:");
	    fname=s.next();
	    
	    System.out.println("Enter Student last name:");
	    lname=s.next();
	    
	    System.out.println("Enter Subject 1 marks:");
	    Subject1=s.nextInt();
	    
	    System.out.println("Enter Subject 2 marks:");
	    Subject2=s.nextInt();
	    
	    System.out.println("Enter Subject 3 marks:");
	    Subject3=s.nextInt();
	    
	    System.out.println("Enter Subject 4 marks:");
	    Subject4=s.nextInt();
	    
	    System.out.println("Enter Subject 5 marks:");
	    Subject5=s.nextInt();
	    
	    System.out.println("Enter Subject 6 marks:");
	    Subject6=s.nextInt();
	    
	    total= Subject1+ Subject2+ Subject3+ Subject4+ Subject5+ Subject6;
	    
	    average=total/6;
	    
	    System.out.println("Student Id:    "+StudId);
	    System.out.println("Student Name:  "+fname+" "+lname);
	    System.out.println("Subject 1:     "+Subject1);
	    System.out.println("Subject 2:     "+Subject2);
	    System.out.println("Subject 3:     "+Subject3);
	    System.out.println("Subject 4:     "+Subject4);
	    System.out.println("Subject 5:     "+Subject5);
	    System.out.println("Subject 6:     "+Subject6);
	    System.out.println("Total Marks:   "+total);
	    System.out.println("Average:       "+average);
	    }
	}
