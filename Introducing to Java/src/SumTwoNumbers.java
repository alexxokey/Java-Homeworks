import java.util.Scanner;


public class SumTwoNumbers {

	public static void main(String[] args) {
		
		System.out.print("Enter the first number: ");
		Scanner st = new Scanner(System.in);
	    int firstNum = st.nextInt();
	    
	    System.out.print("Enter the second number: ");
	    Scanner nd = new Scanner(System.in);
	    int secondNum = nd.nextInt();
	    
	    int sumNums = firstNum + secondNum;
	    System.out.println("The sum of the numbers is: " + sumNums);

	}

}
