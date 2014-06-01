import java.util.Scanner;


public class LongestIncreasingSequence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String numbersOnLine = scan.nextLine();
		String[] numbers = numbersOnLine.split(" ");
		int[] intNumbers = new int[numbers.length];
		for (int i = 0; i < intNumbers.length; i++) {
			intNumbers[i] = Integer.parseInt(numbers[i]);
		}
		int counter = 1;
		int counterTemp = 1;
		int positionInArr = 0; 

		for (int i = 1; i < numbers.length; i++) {
			if (intNumbers[i] > intNumbers[i - 1]) {
				counterTemp++;
				System.out.print(" " + intNumbers[i]);
			} else {
				counterTemp = 1;
				System.out.println();
				System.out.print(intNumbers[i]);
			}
			if (counterTemp > counter) {
				counter = counterTemp;
				positionInArr = i;
			}
		}
		System.out.println();
		System.out.print("Longest: ");
		for (int j = 0; j < counter - 1; j++) {
			System.out.print(intNumbers[positionInArr - counter + 1 + j] + " ");
		}
		System.out.println(intNumbers[positionInArr]);
	}
}
