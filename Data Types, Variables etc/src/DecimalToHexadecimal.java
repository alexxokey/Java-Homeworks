import java.util.Scanner;


public class DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long num = scan.nextLong();
		String hex = Long.toHexString(num);
		System.out.println(hex);

	}


}
