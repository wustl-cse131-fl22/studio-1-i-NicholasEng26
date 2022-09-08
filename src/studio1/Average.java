package studio1;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input value for n1: ");
		int n1 = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Input value for n2: ");
		int n2 = sc2.nextInt();
		
		double avg = (n1 + n2)/2.0;
		
		System.out.println("Average: " + avg);
	}

}
