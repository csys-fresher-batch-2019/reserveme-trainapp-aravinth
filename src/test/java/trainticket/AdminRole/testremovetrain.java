package trainticket.AdminRole;

import java.util.Scanner;

import trainticket.Logger.logger;

public class testremovetrain {

	public static void main(String[] args) throws Exception{
		AdminListOfTrainsImpl obj2 = new AdminListOfTrainsImpl();
		Scanner scan = new Scanner(System.in);
		 logger out = logger.getInstance();
		out.info("======REMOVE TRAINS======");
		out.getInput("Enter the Train Number to delete:");
		int trainNum= scan.nextInt();
		obj2.removeTrain(trainNum);

	}

}
