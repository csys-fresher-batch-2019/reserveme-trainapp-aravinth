
package trainticket.testAdminWork;

import java.util.Scanner;

import trainticket.AdminRole.testUpdateTrain;
import trainticket.AdminRole.testaddtrain;
import trainticket.AdminRole.testremovetrain;

public class testAdminwork {

	public static void main(String[] args) throws Exception {
		System.out.println("WELCOME ADMIN");
		Scanner scan =new Scanner(System.in);
		System.out.println("Select your choice....\n1.Add Trains\n2.Remove Trains\n3.Update Trains");
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
			System.out.println("Your input is incorrect...\n choose a correct option..");
			testAdminwork.main(null);
		}

	}

}
