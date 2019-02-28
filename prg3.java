package prg3;

interface TravelPlan{
	public void chennai_to_hyd(String mode, double fare);
	public void hyd_to_indore(String mode, double fare);
	public void indore_to_delhi(String mode, double fare);
}

class TravelAgent implements TravelPlan
{
	double totalfare=0;
	public void chennai_to_hyd(String mode,double fare)
	{
		System.out.println("Travel Chennai to Hyderabad by "+mode+". Travel fare is"+fare);
		totalfare+=fare;
	}
	public void hyd_to_indore(String mode,double fare)
	{
		System.out.println("Travel Hyderabad to Indore by "+mode+". Travel fare is"+fare);
		totalfare+=fare;
	}
	public void indore_to_delhi(String mode,double fare)
	{
		System.out.println("Travel Indore to Delhi by "+mode+". Travel fare is "+fare);
		totalfare+=fare;
	}
}

public class prg3 {
	public static void main(String args[])
	{
		TravelAgent t1 = new TravelAgent();
		t1.chennai_to_hyd("Plane", 4000.0);
		t1.hyd_to_indore("Bus", 850.0);
		t1.indore_to_delhi("Train", 950.0);
		System.out.println("Total Fare is: "+t1.totalfare);
	}

}

