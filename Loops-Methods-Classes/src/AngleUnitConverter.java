import java.util.ArrayList;
import java.util.Scanner;


public class AngleUnitConverter {
	public static double converter(double val, String measure) {
		if (measure.equals("rad")) {
			return Math.toDegrees(val);
		}
		else {
			return Math.toRadians(val);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<>();
		System.out.print("Enter number n: ");
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			double value = scan.nextDouble();
		    String measure = scan.next();
		    list.add(converter(value, measure));
		}
		System.out.println();
		for (Double converted : list) {
		    System.out.printf("%.6f\n", converted);
		}
	}

}
