package trainticket.AdminRole;

public class AdminListOfTrains {
	@Override
	public String toString() {
		return "AdminListOfTrains [trainnum=" + trainnum + ", trainname=" + trainname + ", Sourcestation="
				+ Sourcestation + ", Destinationstation=" + Destinationstation + ", ticketPrice=" + ticketPrice
				+ ", journeyDate=" + journeyDate + ", travellingTime=" + travellingTime + "]";
	}
	public int trainnum;
	public String trainname;
	public String Sourcestation;
	public String Destinationstation;
	public int ticketPrice;
	public String journeyDate;
	public String travellingTime;
	public int totNumOfSeats;
	public int availableSeats;
	}


