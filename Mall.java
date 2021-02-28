/**
 * The Mall class defines the Mall business.
 * It extends the Business class, which is one of the occupancy groups.
 * 
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-02-27
 */
public class Mall extends Business{
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	/**
	 * The empty argument constructor instantiates the class
	 * and initializes all of the variables.
	 */
	public Mall() {
		super();
		this.numRentedUnits = 0;
		this.medianUnitSize = 0.0;
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
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
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
				+ "Rented Units: %s \n"
				+ "Median Unit Size: %s \n"
				+ "Parking Spaces: %s \n", super.displayData(), this.numRentedUnits, this.medianUnitSize, this.numParkingSpaces);
	}

	/**
	 * This method is a getter for the numRentedUnits variable.
	 * 
	 * @return The number of rented units.
	 */
	public int getNumRentedUnits() {
		return numRentedUnits;
	}

	/**
	 * This method is a setter for the numRentedUnits variable.
	 * 
	 * @param numRentedUnits The number of rented units.
	 * @return nothing
	 */
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}

	/**
	 * This method is a getter for the medianUnitSize variable.
	 * 
	 * @return The median unit size.
	 */
	public double getMedianUnitSize() {
		return medianUnitSize;
	}

	/**
	 * This method is a setter for the medianUnitSize variable.
	 * 
	 * @param medianUnitSize The median unit size.
	 * @return nothing
	 */
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	/**
	 * This method is a getter for the numParkingSpaces variable.
	 * 
	 * @return The number of parking spaces.
	 */
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}

	/**
	 * This method is a setter for the numParkingSpaces variable.
	 * 
	 * @param numParkingSpaces The number of parking spaces.
	 * @return nothing
	 */
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}

	/**
	 * This method returns the string representation
	 * of the object.
	 * 
	 * @return String representation of the object.
	 */
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
