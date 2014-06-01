public class FullHouse {
	public static void printFace(int n){
		if (n <= 10) {
			System.out.print(n);
		}
		else {
			switch (n) {
			case 11:
				System.out.print("J");
				break;
			case 12:
				System.out.print("Q");
				break;
			case 13:
				System.out.print("K");
				break;
			case 14:
				System.out.print("A");
				break;
			}
		}
	}
	
	public static void printSuit(int n) {
		switch (n){
		case 1:
			System.out.print('♣' + " ");
			break;
		case 2:
			System.out.print('♦' + " ");
			break;
		case 3:
			System.out.print('♥' + " ");
			break;
		case 4:
			System.out.print('♠' + " ");
			break;
		}
	}
	
	public static void main(String[] args) {
		int countFH = 0;
		for (int threeEq = 2; threeEq < 15; threeEq++) {
			for (int twoEq = 2; twoEq < 15; twoEq++) {
				if (threeEq != twoEq) {
					for (int firstSuit = 1; firstSuit < 5; firstSuit++) {
						for (int secondSuit = firstSuit + 1; secondSuit < 5; secondSuit++) {
							for (int thirdSuit = secondSuit + 1; thirdSuit < 5; thirdSuit++) {
								for (int fourthSuit = 1; fourthSuit < 5; fourthSuit++) {
									for (int fifthSuit = fourthSuit + 1; fifthSuit < 5; fifthSuit++) {
										countFH++;
										printFace(threeEq);
                                		printSuit(firstSuit);
					                    printFace(threeEq);
					                    printSuit(secondSuit);
					                    printFace(threeEq);
					                    printSuit(thirdSuit);
					                    printFace(twoEq);
					                    printSuit(fourthSuit);
					                    printFace(twoEq);
					                    printSuit(fifthSuit);
					                    System.out.println();
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.printf("The count of the full houses is: %s", countFH);
	}
}
