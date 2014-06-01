
import java.util.Arrays;
import java.util.Scanner;


public class SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number n: ");
		int n = scan.nextInt();
		System.out.printf("Enter the %s numbers that should be sorted: ", n);
		int[] numbers = new int[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt();
		}
		Arrays.sort(numbers);
		for (int j = 1; j < numbers.length; j++) {
			System.out.print(numbers[j] + " ");
		}
		System.out.print(numbers[n-1]);
	}

}
