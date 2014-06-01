import java.util.ArrayList;
import java.util.Scanner;


public class CombineListsofLetters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Character> arrFirstLetter = new ArrayList<Character>();
		ArrayList<Character> arrSecondLetter = new ArrayList<Character>();
		ArrayList<Character> arrPrint = new ArrayList<Character>();

		for (char ch : scan.nextLine().toCharArray()) {
			arrFirstLetter.add(ch);
		}
		
		for (char ch : scan.nextLine().toCharArray()) {
			arrSecondLetter.add(ch);
		}
		arrPrint.addAll(arrFirstLetter);

		for (int i = 0; i < arrSecondLetter.size(); i++) {
			if (arrFirstLetter.contains(arrSecondLetter.get(i))) {
				continue;
			} else {
				arrPrint.add(' ');
				arrPrint.add(arrSecondLetter.get(i));
			}
		}

		for (int i = 0; i < arrPrint.size(); i++) {
			System.out.print(arrPrint.get(i));
		}
	}
}
