import java.util.Scanner;


public class RectangleArea {

	public static void main(String[] args) {
		System.out.print("Enter the width of the rectangle: ");
		Scanner first = new Scanner(System.in);
		int width = first.nextInt();
		System.out.print("Enter the height of the rectangle:");
		Scanner second = new Scanner(System.in);
		int height = second.nextInt();
		int area = width * height;
		System.out.println("The Area of the rectangle is: " + area);
	}

}
