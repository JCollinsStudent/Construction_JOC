
public class Apartment extends Residential{
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	public Apartment() {
		super();
		this.numRentableUnits = 0;
		this.avgUnitSize = 0.0;
		this.parkingAvailable = false;
	}

	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subGroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		// TODO Auto-generated constructor stub
	}

	public void draw() {
		System.out.println("Drawing code for " + this.getClass() + ".");
	}
	
	public String displayData() {
		return String.format("%s"
				+ "Rentable Units: %s \n"
				+ "Average Unit Size: %s \n"
				+ "Parking Available: %s \n", super.displayData(), this.numRentableUnits, this.avgUnitSize, this.parkingAvailable);
	}

	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	public double getAvgUnitSize() {
		return avgUnitSize;
	}

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	public boolean isParkingAvailable() {
		return parkingAvailable;
	}

	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}

	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + ", numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subGroup=" + subGroup + ", displayData()=" + displayData() + ", toString()=" + super.toString()
				+ ", getProjectName()=" + getProjectName() + ", getCompleteAddress()=" + getCompleteAddress()
				+ ", getTotalSquareFeet()=" + getTotalSquareFeet() + ", getOccupancyGroup()=" + getOccupancyGroup()
				+ ", getSubGroup()=" + getSubGroup() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
}
