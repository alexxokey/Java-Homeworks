import java.util.Scanner;


public class FormattingNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a positive integer(0<=integer<=500): ");
		int a = scan.nextInt();
		
		System.out.print("Enter a floating-point number: ");
		double b = scan.nextDouble();
		
		System.out.print("Enter another floating-point number: ");
		double c = scan.nextDouble();
		
		String hex = Integer.toHexString(a);
		String paddedHex = hex + "          ".substring(hex.length()) ;
        System.out.printf("|" + paddedHex + "|");
           
        String bin = Integer.toBinaryString(a);
        String paddedBin = "0000000000".substring(bin.length()) + bin ;
        System.out.print(paddedBin + "|");
        
        
        String twoSigns = Double.toString(b);
        twoSigns = String.format("%.2f",Double.parseDouble(twoSigns));
        String paddedtwoSigns = "          ".substring(twoSigns.length()) + twoSigns ;
        System.out.print(paddedtwoSigns + "|");
        
        String threeSigns = Double.toString(c);
        threeSigns = String.format("%.3f",Double.parseDouble(threeSigns));
        String paddedthreeSigns = "          ".substring(threeSigns.length()) + threeSigns ;
        System.out.println(paddedthreeSigns + "|");
	}
}