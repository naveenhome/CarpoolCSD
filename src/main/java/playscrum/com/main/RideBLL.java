package playscrum.com.main;

public class RideBLL {

	public String validate(Ride ride)
	{
		if(ride.getName().equals(" "))
		{
			return "Name is required";
		}
		else
		{
		return "Posting is successful";
		}
		
	}
}
