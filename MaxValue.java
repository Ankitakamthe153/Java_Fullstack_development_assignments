import java.util.Arrays;

public class MaxValue {
	public static void main(String[] args) {
		int[] c= {90,45,67,21,78,94,75};
		
		Arrays.sort(c);
		
		System.out.println("Maximum Value is:"+c[c.length-1]);
	}

}
