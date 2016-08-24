
public abstract class Vehicle {

	public String vehicleType;
	
	public Integer getNumberofSeats()
	{
		if(this.vehicleType.equals("Car"))
		{
			return 2;
		}
		else if( this.vehicleType.equals("Bus"))
		{
			return 20;
		}
		return null;
	}
	
	public String getVehicleType()
	{
		return this.vehicleType;
	}
	
	public abstract Integer getNumberofWheels();
}

