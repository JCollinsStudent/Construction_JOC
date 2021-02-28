/**
 * The Business class defines the Business occupancy group.
 * It extends the Building class, which is at the top of the class hierarchy.
 * 
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-02-27
 */
public class Business extends Building{
	protected int numRentableUnits;
	
	/**
	 * The empty argument constructor instantiates the class
	 * and initializes all of the variables.
	 */
	public Business() {
		super();
		this.numRentableUnits = 0;
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
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
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
				+ "Rentable Units: %s \n", super.displayData(), this.numRentableUnits);
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
	 * This method returns the string representation
	 * of the object.
	 * 
	 * @return String representation of the object.
	 */
	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subGroup=" + subGroup + ", displayData()=" + displayData() + ", toString()=" + super.toString()
				+ ", getProjectName()=" + getProjectName() + ", getCompleteAddress()=" + getCompleteAddress()
				+ ", getTotalSquareFeet()=" + getTotalSquareFeet() + ", getOccupancyGroup()=" + getOccupancyGroup()
				+ ", getSubGroup()=" + getSubGroup() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
}
