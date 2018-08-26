import java.util.Random;

public class Solution3 { 

	// Generate 500 random numbers and print the nth smallest number in a programming language of your choice. 
	
	private static int i, a = 0, small = 500;

	public static void main(String[] args) {
		Random ran = new Random();
		for (i = 0; i < 500; i++) {

			a = ran.nextInt(500);
			System.out.println(a);

			if (a < small)
				small = a;
		}

		System.out.println("The smallest number is :" + small);
	}

}
