package Five;

public class Vehicle {
	private String registrationNumber;
	private long vehicleSpeed;
	private long fuelCapacity;
	private long fuelConsumption;
	
	public Vehicle(String registrationNumber, long vehicleSpeed, long fuelCapacity, long fuelConsumption) {
		super();
		this.registrationNumber = registrationNumber;
		this.vehicleSpeed = vehicleSpeed;
		this.fuelCapacity = fuelCapacity;
		this.fuelConsumption = fuelConsumption;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public long getVehicleSpeed() {
		return vehicleSpeed;
	}
	public void setVehicleSpeed(long vehicleSpeed) {
		this.vehicleSpeed = vehicleSpeed;
	}
	public long getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(long fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public long getFuelConsumption() {
		return fuelConsumption;
	}
	public void setFuelConsumption(long fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
	
}
