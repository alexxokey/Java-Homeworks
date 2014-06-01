import java.util.Scanner;


public class CountAllWords {

	public static void main(String[] args) {
		System.out.println("Enter text: ");
		Scanner scan = new Scanner(System.in);
		String wordsOnLine = scan.nextLine();
		String[] words = wordsOnLine.split("\\W+");				
		System.out.printf("The count of the words is: %s", words.length);
	}

}
