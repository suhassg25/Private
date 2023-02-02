package Five;

public class Bus extends Vehicle {

	long numberofpassengers;

	public Bus(String registrationNumber, long vehicleSpeed, long fuelCapacity, long fuelConsumption,
			long numberofpassengers) {
		super(registrationNumber, vehicleSpeed, fuelCapacity, fuelConsumption);
		this.numberofpassengers = numberofpassengers;
	}

	long dist;
	long fuelneeded;

	public long fuelNeeded(long km) {
		fuelneeded = getFuelConsumption() * km;
		return fuelneeded;
	}

	public long distanceCovered(long hrs) {
		dist = getVehicleSpeed() * hrs;
		return dist;

	}
	public void display()
	{
		System.out.println("Registrartion number : "+getRegistrationNumber()+"\nVehicle Speed : "+getVehicleSpeed()+"\nFuel Capacity : "+getFuelCapacity()+"\nFuel consumed : "+getFuelConsumption()+"\nNo of Passengers : "+numberofpassengers+"\nFuel Needed in liters: "+fuelneeded+" liters" +"\nDistance Covered : "+dist);
	}

}
