
import java.util.Scanner;


public class TriangleArea {

	public static void main(String[] args) {
		System.out.println("Enter the x and y coordinates of the A point, separated by \" \"");
		Scanner scanA = new Scanner(System.in);
		int pointA_x = scanA.nextInt();
		int pointA_y = scanA.nextInt();
		System.out.println("Enter the x and y coordinates of the B point, separated by \" \"");
		Scanner scanB = new Scanner(System.in);
		int pointB_x = scanB.nextInt();
		int pointB_y = scanB.nextInt();
		System.out.println("Enter the x and y coordinates of the C point, separated by \" \"");
		Scanner scanC = new Scanner(System.in);
		int pointC_x = scanC.nextInt();
		int pointC_y = scanC.nextInt();
		int area = (pointA_x * (pointB_y - pointC_y) + pointB_x * (pointC_y - pointA_y) + pointC_x * (pointA_y - pointB_y)) / 2;

		if (area >= 0) {
			System.out.println("The area of the triangle is: " + area);
		}
		else {
			area = -area;
			System.out.println("The area of the triangle is: " + area);
		}
	}

}
