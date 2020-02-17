package trainticket.AdminRole;

import java.util.Scanner;

import trainticket.Logger.logger;

public class testUpdateTrain {

	public static void main(String[] args) throws Exception {	
		AdminListOfTrainsImpl obj2 = new AdminListOfTrainsImpl();
		AdminListOfTrains l = new AdminListOfTrains();
		Scanner scan = new Scanner(System.in);
		 logger out = logger.getInstance();
		out.getInput("Enter train Number:");
		int trainNum = scan.nextInt();
		out.getInput("Enter Travelling start time:");
		
		String startTime = scan.next();
		
		out.getInput("Enter Travelling endtime");
	    String endTime = scan.next();
	    
	    String travellingTime = startTime + " to " + endTime;
	    out.getInput("Enter the Source Station");
		obj2.updateTimings(trainNum,travellingTime);
		
	}

}
