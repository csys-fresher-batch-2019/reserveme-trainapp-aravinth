package trainticket.AdminRole;

import java.util.Scanner;

public class testUpdateTrain {

	public static void main(String[] args) throws Exception {	
		AdminListOfTrainsImpl obj2 = new AdminListOfTrainsImpl();
		AdminListOfTrains l = new AdminListOfTrains();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter train Number:");
		int trainNum = scan.nextInt();
		System.out.println("Enter Travelling start time:");
		
		String startTime = scan.next();
		
	    System.out.println("Enter Travelling endtime");
	    String endTime = scan.next();
	    
	    String travellingTime = startTime + " to " + endTime;
		System.out.println("Enter the Source Station");
		obj2.updateTimings(trainNum,travellingTime);
		
	}

}
