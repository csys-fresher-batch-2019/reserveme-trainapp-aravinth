
package trainticket.testAdminWork;

import java.util.Scanner;

import trainticket.AdminRole.testUpdateTrain;
import trainticket.AdminRole.testaddtrain;
import trainticket.AdminRole.testremovetrain;
import trainticket.Logger.logger;

public class testAdminwork {

	public static void main(String[] args) throws Exception {
		Scanner scan =new Scanner(System.in);
		logger out =logger.getInstance();
		out.info("WELCOME ADMIN");
		out.info("Select your choice....\n1.Add Trains\n2.Remove Trains\n3.Update Trains");
		int choice  = scan.nextInt();
		if(choice==1)
		{
			testaddtrain.main(null);
		}
		else if(choice==2)
		{
			testremovetrain.main(null);
		}
		else if(choice == 3)
		{
			testUpdateTrain.main(null);
		}
		else
		{
			out.info("Your input is incorrect...\n choose a correct option..");
			testAdminwork.main(null);
		}

	}

}
