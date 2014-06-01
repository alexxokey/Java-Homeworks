import java.util.Scanner;


public class LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String stringsOnLine = scan.nextLine();
		String[] strings = stringsOnLine.split(" ");
		int counterTemp = 1;
		int counter = 1;
		int positionInArr = 0; 


		for (int i = 1; i < strings.length; i++) {
			if (strings[i].equals(strings[i - 1])) {
				counterTemp++;
			} else {
				counterTemp = 1;
			}
			if (counterTemp > counter) {
				counter = counterTemp;
				positionInArr = i;
			}
		}
		for (int j = 0; j < counter - 1; j++) {
			System.out.print(strings[positionInArr] + " ");
		}
		System.out.println(strings[positionInArr]);
	}
}
