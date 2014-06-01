import java.util.Scanner;


public class PointInsideAFigure {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double xCoord = scan.nextDouble();
		double yCoord = scan.nextDouble();
		String result;
		
		if (xCoord >= 12.5 && xCoord <= 17.5 && yCoord >= 6.0 && yCoord <= 13.5) {
			result = "Inside";
		} 
		else {
			if (xCoord >= 12.5 && xCoord <= 17.5 && yCoord >= 6.0 && yCoord <= 13.5) {
				
				result = "Inside";
			}
			else {
				if (xCoord >= 17.5 && xCoord <= 20.0 && yCoord >= 6.0 && yCoord <= 8.5) {
					
					result = "Inside";
				}
				else {
					result = "Outside";
				}
			}
		}
		System.out.println(result);		
	}
}
