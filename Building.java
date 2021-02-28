/**
 * The Building class defines a building.
 * It is at the top of the class hierarchy.
 * 
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-02-27
 */
public class Building {
	
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subGroup;
	
	/**
	 * The empty argument constructor instantiates the class
	 * and initializes all of the variables.
	 */
	public Building() {
		this.projectName = "";
		this.completeAddress = "";
		this.totalSquareFeet = 0.0;
		this.occupancyGroup = "";
		this.subGroup = "";
	}
	
	/**
	 * The preferred constructor supports passing parameters to
	 * set the instance values.
	 * 
	 * @param projectName The name of the project.
	 * @param completeAddress The address of the project.
	 * @param totalSquareFeet The square footage of the project.
	 * @param occupancyGroup The occupancy group.
	 * @param subGroup The sub group.
	 */
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subGroup) {
		super();
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
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
		return String.format("Project Name: %s \n"
				+ "Complete Address: %s\n"
				+ "Total Square Feet: %s\n"
				+ "Occupancy Group: %s\n"
				+ "Sub Group: %s\n", projectName, completeAddress, totalSquareFeet,
				occupancyGroup, subGroup);
	}

	/**
	 * This method is a getter for the projectName variable.
	 * 
	 * @return The project name.
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * This method is a setter for the projectName variable.
	 * 
	 * @param projectName The project name.
	 * @return nothing
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * This method is a getter for the completeAddress variable.
	 * 
	 * @return The complete address.
	 */
	public String getCompleteAddress() {
		return completeAddress;
	}

	/**
	 * This method is a setter for the completeAddress variable.
	 * 
	 * @param completeAddress The complete address.
	 * @return nothing
	 */
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	/**
	 * This method is a getter for the totalSquareFeet variable.
	 * 
	 * @return The total square footage.
	 */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	/**
	 * This method is a setter for the totalSquareFeet variable.
	 * 
	 * @param totalSquareFeet The total square footage.
	 * @return nothing
	 */
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	/**
	 * This method is a getter for the occupancyGroup variable.
	 * 
	 * @return The occupancyGroup
	 */
	public String getOccupancyGroup() {
		return occupancyGroup;
	}

	/**
	 * This method is a setter for the occupancyGroup variable.
	 * 
	 * @param occupancyGroup The occupancyGroup.
	 * @return nothing
	 */
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}

	/**
	 * This method is a getter for the subGroup variable.
	 * 
	 * @return The subgroup.
	 */
	public String getSubGroup() {
		return subGroup;
	}

	/**
	 * This method is a setter for the subGroup variable.
	 * 
	 * @param subGroup The subgroup.
	 * @return nothing
	 */
	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	}
	
	/**
	 * This method returns the string representation
	 * of the object.
	 * 
	 * @return String representation of the object.
	 */
	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subGroup=" + subGroup + ", displayData()="
				+ displayData() + ", getProjectName()=" + getProjectName() + ", getCompleteAddress()="
				+ getCompleteAddress() + ", getTotalSquareFeet()=" + getTotalSquareFeet() + ", getOccupancyGroup()="
				+ getOccupancyGroup() + ", getSubGroup()=" + getSubGroup() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
