package Five;

public class Truck extends Vehicle {
	
	public Truck(String registrationNumber, long vehicleSpeed, long fuelCapacity, long fuelConsumption,
			long cargoweightlimit) {
		super(registrationNumber, vehicleSpeed, fuelCapacity, fuelConsumption);
		this.cargoweightlimit = cargoweightlimit;
	}


	long cargoweightlimit;
	long dist;
	long fuelneeded;

	public long fuelNeeded(long km) {
		fuelneeded = getFuelConsumption() * km;
		if(fuelneeded<getFuelCapacity())
		{
			return fuelneeded;
		}
		else
			{
			return 0;
			}
	}

	public long distanceCovered(long hrs) {
		dist = getVehicleSpeed() * hrs;
		return dist;

	}

public void display()
{
	System.out.println("Registrartion number : "+getRegistrationNumber()+"\nVehicle Speed : "+getVehicleSpeed()+"\nFuel Capacity : "+getFuelCapacity()+"\nFuel consumed : "+getFuelConsumption()+"\nCargo Weight Limit : "+cargoweightlimit+"\nFuel Needed in liters: "+fuelneeded+" liters" +"\nDistance Covered : "+dist);
}
}
