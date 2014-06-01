import java.util.Scanner;


public class Generate3LetterWords {

	public static void main(String[] args) {
		System.out.print("Input: ");
		Scanner scan = new Scanner(System.in);
		char[] charakters = scan.next().toCharArray();
		if (charakters.length == 3) {
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					for (int k = 0; k < 3; k++) {
						System.out.printf("%s%s%s " ,charakters[i], charakters[j], charakters[k]);
					}
				}
			}
		}
		else if (charakters.length == 2){

			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					for (int k = 0; k < 2; k++) {
						System.out.printf("%s%s%s " ,charakters[i], charakters[j], charakters[k]);
					}
				}
			}
		}
		else if (charakters.length == 1) {
			System.out.printf("%s%s%s " ,charakters[0], charakters[0], charakters[0]);
		}
	}
}
