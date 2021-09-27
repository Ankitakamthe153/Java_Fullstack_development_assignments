import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int[] a= {5,20,25,10,15};
		 System.out.println("Before Sorting:");
		 for(int b:a) {
			 System.out.println(b);
		 }
		 Arrays.sort(a);
		 
		 System.out.println("After Sorting:");
		 for(int b:a) {
			 System.out.println(b);
		 }
		 
		
	}

}
