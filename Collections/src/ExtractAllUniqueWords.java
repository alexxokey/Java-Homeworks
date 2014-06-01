import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String wordsOnLine = scan.nextLine().toLowerCase();
		String[] text = wordsOnLine.split("\\W+");
		
		Set<String> setWords = new TreeSet<>();
		
		for (String word : text) {
			setWords.add(word);
		}

		for (String word : setWords) {
			System.out.print(word + " ");
		}
	}
}
