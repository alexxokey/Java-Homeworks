import java.util.Arrays;
import java.util.Scanner;


public class SortArrayOfStrings {


	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int numbersCount = sn.nextInt();
		
		String[] words = new String[numbersCount];
		
		for (int i = 0; i < numbersCount; i++) {
			words[i] = sn.next();
		}
		Arrays.sort(words);
		for(int i = 0 ; i < numbersCount; i++) {
                System.out.println(words[i]);
        }
	}

}
