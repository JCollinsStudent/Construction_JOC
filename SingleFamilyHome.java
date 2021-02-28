/**
 * The SingleFamilyHome class defines the SingleFamilyHome project.
 * It extends the Residential class, which is one of the occupancy groups.
 * 
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-02-27
 */
public class SingleFamilyHome extends Residential{
	private boolean garage;
	
	/**
	 * The empty argument constructor instantiates the class
	 * and initializes all of the variables.
	 */
	public SingleFamilyHome() {
		super();
		this.garage = false;
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
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
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
				+ "Garage: %s \n", super.displayData(), this.garage);
	}

	/**
	 * This method is a getter for the garage variable.
	 * 
	 * @return Whether there is a garage.
	 */
	public boolean isGarage() {
		return garage;
	}

	/**
	 * This method is a setter for the garage variable.
	 * 
	 * @param garage Whether there is a garage.
	 * @return nothing
	 */
	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	/**
	 * This method returns the string representation
	 * of the object.
	 * 
	 * @return String representation of the object.
	 */
	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + ", numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms
				+ ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subGroup=" + subGroup + ", displayData()=" + displayData() + ", isGarage()=" + isGarage()
				+ ", getNumBedrooms()=" + getNumBedrooms() + ", getNumBathrooms()=" + getNumBathrooms()
				+ ", isLaundryRoom()=" + isLaundryRoom() + ", toString()=" + super.toString() + ", getProjectName()="
				+ getProjectName() + ", getCompleteAddress()=" + getCompleteAddress() + ", getTotalSquareFeet()="
				+ getTotalSquareFeet() + ", getOccupancyGroup()=" + getOccupancyGroup() + ", getSubGroup()="
				+ getSubGroup() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}
