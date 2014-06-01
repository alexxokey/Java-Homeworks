import java.util.Scanner;


public class CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter text: ");
		String wordsOnLine = scan.nextLine().toLowerCase();
		String[] words = wordsOnLine.split("\\W+");
		System.out.print("Enter word to find: ");
		String wordToFind = scan.next().toLowerCase();
		int counter = 0;
		for (int i = 0; i < words.length; i++) {
			if (wordToFind.equals(words[i])) {
				counter++;
			}
		}
		System.out.printf("The count of the occurances of the word \"%s\" is: %s", wordToFind, counter);
	}

}
