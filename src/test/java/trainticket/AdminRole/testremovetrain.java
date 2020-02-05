package trainticket.AdminRole;

import java.util.Scanner;

public class testremovetrain {

	public static void main(String[] args) throws Exception{
		AdminListOfTrainsImpl obj2 = new AdminListOfTrainsImpl();
		Scanner scan = new Scanner(System.in);
		System.out.println("======REMOVE TRAINS======");
		System.out.println("Enter the Train Number to delete:");
		int trainNum= scan.nextInt();
		obj2.removeTrain(trainNum);

	}

}
