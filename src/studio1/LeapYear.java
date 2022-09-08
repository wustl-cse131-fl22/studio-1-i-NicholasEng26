package studio1;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide a year: ");
		int i = sc.nextInt();
		boolean isLeapYear = ((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0));
		System.out.println(i + " is a leap year: " + isLeapYear);
		
	}

}
