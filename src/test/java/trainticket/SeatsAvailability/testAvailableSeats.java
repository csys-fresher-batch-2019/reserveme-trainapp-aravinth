package trainticket.SeatsAvailability;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import trainticket.AdminRole.TestListTrains;
import trainticket.addingPassengers.testAddPassenger;

public class testAvailableSeats {
	public static void main(String[] args) throws Exception {
		SeatStatusIMPL obj = new SeatStatusIMPL();
			int availableSeats= 0;
			Scanner scan = new Scanner(System.in);
			System.out.println("Choose the Train Number to know Available Seats:");
			int trainNum = scan.nextInt();
		    int seatsCount = obj.AvailSeats(trainNum);
		    if(seatsCount ==0)
		    {
		    	System.out.println("Invalid Train Num");
		    	while(true)
		    	{
		    		System.out.println("Select 1 to retry....");
		    		int press = scan.nextInt();
		    		if(press ==1)
		    		{
		    			testAvailableSeats.main(null);
		    		}
		    		else {
		    			System.out.println("Invalid Option...");
		    		}
		    	}
		    }
		    else {
		    	System.out.println("Currently Available Seats = "+seatsCount);
		    }
		    while(true)
		    {
		    	System.out.println("Please Enter 1 to search Available Seats of other Trains (or) \nEnter 2 to proceed with the train..");
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
		    		System.out.println("Your input is incorrect please Try Again...");
		    	}
		    }
		}

}
