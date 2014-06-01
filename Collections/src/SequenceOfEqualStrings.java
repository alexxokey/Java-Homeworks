import java.util.Scanner;

public class SequenceOfEqualStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String wordsOnLine = in.nextLine();
		String[] words = wordsOnLine .split(" ");
		for (int i = 1; i < words.length; i++) {
			if (words[i].equals(words[i - 1])) {
				System.out.print(words[i - 1] + " " + words[i]);
			} else {
				System.out.println();
				System.out.print(words[i]);
			}
		}
	}	
}