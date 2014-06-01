import java.util.Scanner;


public class SymmetricNumbersInRange {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
    	System.out.print("Enter the beginning of the range: ");
		int begin = scan.nextInt();
		
		System.out.print("Enter the end of the range: ");
		int end = scan.nextInt();
		
		for (int i = begin; i <= end; i++) {
			char[] arr = Integer.toString(i).toCharArray();
			if (arr[0] == arr[arr.length - 1]) {
				System.out.print(i + " ");
			}
		}
	} 	
}
