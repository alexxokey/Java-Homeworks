import java.util.Scanner;


public class CountOfBitsOne {
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int counter = 0;
		
		while(num != 0) {
		
			if (num % 2 == 1) {
				counter ++ ;
			}
		
			num = (num / 2);
		}
		
		System.out.print("The count of the bit 1 in the binary represantation of the number is: " + counter);
	}
}
