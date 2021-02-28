/**
 * The Residential class defines the Residential occupancy group.
 * It extends the Building class, which is at the top of the class hierarchy.
 * 
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-02-27
 */
public class Residential extends Building{
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	/**
	 * The empty argument constructor instantiates the class
	 * and initializes all of the variables.
	 */
	public Residential() {
		super();
		this.numBedrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = false;
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
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
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
				+ "Bedrooms: %s \n"
				+ "Bathrooms: %s \n"
				+ "Laundry Room: %s \n", super.displayData(), this.numBedrooms, this.numBathrooms, this.laundryRoom);
	}

	/**
	 * This method is a getter for the numBedrooms variable.
	 * 
	 * @return The number of bedrooms.
	 */
	public int getNumBedrooms() {
		return numBedrooms;
	}

	/**
	 * This method is a setter for the numBedrooms variable.
	 * 
	 * @param numBedrooms The number of bedrooms.
	 * @return nothing
	 */
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	/**
	 * This method is a getter for the numBathrooms variable.
	 * 
	 * @return The number of bathrooms.
	 */
	public int getNumBathrooms() {
		return numBathrooms;
	}

	/**
	 * This method is a setter for the numBathrooms variable.
	 * 
	 * @param numBathrooms The number of bathrooms.
	 * @return nothing
	 */
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	/**
	 * This method is a getter for the laundryRoom variable.
	 * 
	 * @return Whether there is a laundry room.
	 */
	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	/**
	 * This method is a setter for the laundryRoom variable.
	 * 
	 * @param laundryRoom Whether there is a laundry room.
	 * @return nothing
	 */
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}

	/**
	 * This method returns the string representation
	 * of the object.
	 * 
	 * @return String representation of the object.
	 */
	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subGroup="
				+ subGroup + ", displayData()=" + displayData() + ", toString()=" + super.toString()
				+ ", getProjectName()=" + getProjectName() + ", getCompleteAddress()=" + getCompleteAddress()
				+ ", getTotalSquareFeet()=" + getTotalSquareFeet() + ", getOccupancyGroup()=" + getOccupancyGroup()
				+ ", getSubGroup()=" + getSubGroup() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
}
