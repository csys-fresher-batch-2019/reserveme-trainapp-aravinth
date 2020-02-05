package trainticket.AdminRole;

public interface AdminListOfTrainsDAO {
	
	public void addTrains(AdminListOfTrains l)throws Exception;
	
	public void removeTrain(int trainNum)throws Exception;
	
	public void updateTimings(int train_num,String TravellingTime) throws Exception;
	
	public void addPromo(String PromoCode,int discountValue)throws Exception;
}
