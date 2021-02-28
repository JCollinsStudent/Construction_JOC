/**
 * The Apartment class defines the Apartment project.
 * It extends the Residential class, which is one of the occupancy groups.
 * 
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-02-27
 */
public class Apartment extends Residential{
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	/**
	 * The empty argument constructor instantiates the class
	 * and initializes all of the variables.
	 */
	public Apartment() {
		super();
		this.numRentableUnits = 0;
		this.avgUnitSize = 0.0;
		this.parkingAvailable = false;
	}

	/**
	 * The preferred constructor supports passing parameters to
	 * set the variables inherited from the Building class.
	 * 
	 * @param projectName The name of the project.
	 * @param completeAddress The address of the project.
	 * @param totalSquareFeet The square footage of the project.
	 * @param occupancyGroup The occupancy group.
	 * @param subGroup The sub group.
	 */
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subGroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		// TODO Auto-generated constructor stub
	}

	/**
	 * This method in this prototype prints that
	 * the code is being drawn.
	 * 
	 * @return nothing
	 */
	public void draw() {
		System.out.println("Drawing code for " + this.getClass() + ".");
	}
	
	/**
	 * This method returns a string containing
	 * all of the project's information.
	 * 
	 * @return The project data
	 */
	public String displayData() {
		return String.format("%s"
				+ "Rentable Units: %s \n"
				+ "Average Unit Size: %s \n"
				+ "Parking Available: %s \n", super.displayData(), this.numRentableUnits, this.avgUnitSize, this.parkingAvailable);
	}

	/**
	 * This method is a getter for the numRentableUnits variable.
	 * 
	 * @return The number of rentable units.
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	/**
	 * This method is a setter for the numRentableUnits variable.
	 * 
	 * @param numRentableUnits The number of rentable units.
	 * @return nothing
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	/**
	 * This method is a getter for the avgUnitSize variable.
	 * 
	 * @return The average unit size.
	 */
	public double getAvgUnitSize() {
		return avgUnitSize;
	}

	/**
	 * This method is a setter for the avgUnitSize variable.
	 * 
	 * @param avgUnitSize The average unit size.
	 * @return nothing
	 */
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	/**
	 * This method is a getter for the parkingAvailable variable.
	 * 
	 * @return Whether parking is available.
	 */
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}

	/**
	 * This method is a setter for the parkingAvailable variable.
	 * 
	 * @param parkingAvailable Whether parking is available.
	 * @return nothing
	 */
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}

	/**
	 * This method returns the string representation
	 * of the object.
	 * 
	 * @return String representation of the object.
	 */
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
