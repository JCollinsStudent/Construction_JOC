
public class Mall extends Business{
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	public Mall() {
		super();
		this.numRentedUnits = 0;
		this.medianUnitSize = 0.0;
	}

	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subGroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		// TODO Auto-generated constructor stub
	}
	
	public void draw() {
		System.out.println("Drawing code for " + this.getClass() + ".");
	}
	
	public String displayData() {
		return String.format("%s"
				+ "Rented Units: %s \n"
				+ "Median Unit Size: %s \n"
				+ "Parking Spaces: %s \n", super.displayData(), this.numRentedUnits, this.medianUnitSize, this.numParkingSpaces);
	}

	public int getNumRentedUnits() {
		return numRentedUnits;
	}

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}

	public double getMedianUnitSize() {
		return medianUnitSize;
	}

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}

	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}

	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + ", numRentableUnits=" + numRentableUnits + ", projectName=" + projectName
				+ ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup="
				+ occupancyGroup + ", subGroup=" + subGroup + ", displayData()=" + displayData()
				+ ", getNumRentableUnits()=" + getNumRentableUnits() + ", toString()=" + super.toString()
				+ ", getProjectName()=" + getProjectName() + ", getCompleteAddress()=" + getCompleteAddress()
				+ ", getTotalSquareFeet()=" + getTotalSquareFeet() + ", getOccupancyGroup()=" + getOccupancyGroup()
				+ ", getSubGroup()=" + getSubGroup() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
	
	
	
}
