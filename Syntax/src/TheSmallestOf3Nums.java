import java.util.Scanner;


public class TheSmallestOf3Nums {
	public static void main(String[] args) {
		Scanner scanA = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		double a = scanA.nextDouble();	
		
		System.out.println("Enter the second number:");
		double b = scanA.nextDouble();
		
		System.out.println("Enter the third number:");
		double c = scanA.nextDouble();
		
		double minNum = Math.min(a, b);
		
		if (c < minNum) {
			minNum = c;
		} 
		System.out.println("The smallest number is: " + minNum);
	}
}
