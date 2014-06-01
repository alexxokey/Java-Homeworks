import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
 

public class DaysBetweenTwoDates {

 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
	
	System.out.print("Insert first date : ");
    String firstDate = scan.nextLine();
    
    System.out.print("Insert second date : ");
    String secondDate = scan.nextLine();
	try {
		Date date1 = format.parse(firstDate);
		Date date2 = format.parse(secondDate);    
	    long diff = date2.getTime() - date1.getTime();
	    
	    System.out.println("Days between the two dates: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
	} catch (ParseException e) {
		e.printStackTrace();
	}
    
   }

 }