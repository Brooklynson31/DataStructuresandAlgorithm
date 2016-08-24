
public class main1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle myCar = new Car();
		System.out.println("My " + myCar.getVehicleType() + "has" + myCar.getNumberofSeats() + "seats");
		System.out.println("My " + myCar.getVehicleType() + "has" + myCar.getNumberofWheels() + "wheels");
		
		Vehicle myBus = new Bus();
		System.out.println("My " + myBus.getVehicleType() + "has" + myBus.getNumberofSeats() + "seats");
		System.out.println("My " + myBus.getVehicleType() + "has" + myBus.getNumberofWheels() + "wheels");
	}

}
