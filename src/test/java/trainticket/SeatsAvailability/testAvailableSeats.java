package trainticket.SeatsAvailability;

import java.util.Scanner;

import trainticket.Logger.logger;
import trainticket.addingPassengers.testAddPassenger;

public class testAvailableSeats {
	public static void main(String[] args) throws Exception {
		SeatStatusIMPL obj = new SeatStatusIMPL();
			Scanner scan = new Scanner(System.in);
			 logger out = logger.getInstance();
			out.getInput("Choose the Train Number to know Available Seats:");
			int trainNum = scan.nextInt();
		    int seatsCount = obj.AvailSeats(trainNum);
		    if(seatsCount ==0)
		    {
		    	out.info("Invalid Train Num");
		    	while(true)
		    	{
		    		out.info("Select 1 to retry....");
		    		int press = scan.nextInt();
		    		if(press ==1)
		    		{
		    			testAvailableSeats.main(null);
		    		}
		    		else {
		    			out.info("Invalid Option...");
		    		}
		    	}
		    }
		    else {
		    	out.info("Currently Available Seats = "+seatsCount);
		    }
		    while(true)
		    {
		    	out.info("Please Enter 1 to search Available Seats of other Trains (or) \nEnter 2 to proceed with the train..");
		    	int choice = scan.nextInt();
		    	if(choice==1)
		    	{
	    			testAvailableSeats.main(null);	
	    			break;
		    	}
		    	else if(choice ==2)
		    	{
		    		testAddPassenger.main(null);
		    		break;
		    	}
		    	else {
		    		out.info("Your input is incorrect please Try Again...");
		    	}
		    }
		}

}
