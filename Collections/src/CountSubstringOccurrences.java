import java.util.Scanner;


public class CountSubstringOccurrences {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter text: ");
		String wordsOnLine = scan.nextLine().toLowerCase();
		System.out.print("Enter substring: ");
		String word = scan.nextLine().toLowerCase();
		int counter = 0;

		for (int i = 0; i <= wordsOnLine.length() - word.length(); i++) {
			if (wordsOnLine.substring(0 + i, word.length() + i).contains(word)) {
				counter++;
			}
		}
		System.out.printf("The count of substring occurances of \"%s\" is: ", word, counter);
	}
}

