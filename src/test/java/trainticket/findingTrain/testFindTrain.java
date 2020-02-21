package trainticket.findingTrain;

import java.util.ArrayList;
import java.util.Scanner;

import trainticket.Logger.logger;
import trainticket.SeatsAvailability.testAvailableSeats;
import trainticket.searchingTrain.findTrain;
import trainticket.searchingTrain.findTrainIMPL;

public class testFindTrain {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		 logger out = logger.getInstance();
		out.getInput("Enter Source Station:");
		String sourceStation = scan.next();
		out.getInput("Enter Destination Station:");
		String destinationStation = scan.next();
		out.getInput("Enter journeyDate:");
		String journeyDate = scan.next();
		findTrainIMPL obj = new findTrainIMPL();
		ArrayList<findTrain> trains1 = new ArrayList<findTrain>();
		trains1 = obj.SearchTrain(sourceStation, destinationStation, journeyDate);
		if (trains1.size() > 0) {
			for (findTrain obj1 : trains1) {
				out.info(obj1);
			}			
			testAvailableSeats.main(null);
		} else {
			out.info("Oops Trains not available!!!");
		}
	}
}
