package week;
import java.util.Scanner;
public class weekday {

	public static void main(String[] args) {


		// will display the days of the week

		String[] weekday = {"","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number between 1 and 7");
		while(!sc.hasNext("[1-7]")) {//using a regular expression - regex
			System.out.println("Make sure you enter a value from 1 to 7");
			sc.next();
		}

		System.out.println(weekday[Integer.parseInt(sc.next())]);

		sc.close();
	}
}




