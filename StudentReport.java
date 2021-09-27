import java.util.Arrays;
import java.util.Scanner;

public class StudentReport {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		int StudRollNo;
		int[] marks = new int[6];
		String StudName;
		int average,total=0;
		System.out.println("Enter Student Roll No.:");
			StudRollNo=sc.nextInt();
			
			System.out.println("Enter student FullName:");
			StudName =sc.next();
			
			
			for(int j=0;j<6;j++)
			{
				System.out.println("Enter marks of subject"+(j+1)+":");
				marks[j]=sc.nextInt();
				total+=marks[j];
			}
		
		average = total/6;
		System.out.println("   Student Report");
		System.out.println("--------------------------------");
		System.out.println("Student Roll No.        :"+StudRollNo);
		System.out.println("Student Name            :"+StudName);
		
		System.out.println("Marks of Subject1  	:"+marks[0]);
		System.out.println("Marks of Subject2  	:"+marks[1]);
		System.out.println("Marks of Subject3  	:"+marks[2]);
		System.out.println("Marks of Subject4  	:"+marks[3]);
		System.out.println("Marks of Subject5  	:"+marks[4]);
		System.out.println("Marks of Subject6  	:"+marks[5]);
		
		
		Arrays.sort(marks);
		System.out.println("Lowest Subject Marks	:"+marks[0]);
		System.out.println("Highest Subject Marks	:"+marks[marks.length-1]);
		System.out.println("Total Marks        	:"+total);
		System.out.println("Average of Marks   	: "+average);
		
		for(int y:marks) {
			if(y < 40) {
				count++;
			}
		}
	   if(count>0) {
			System.out.println("Result             	:Fail");
		}else {
			System.out.println("Result             	:Pass");
		}
		
     }
}	
		
		


