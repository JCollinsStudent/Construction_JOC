
public class Building {
	
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subGroup;
	
	
	public Building() {
		this.projectName = "";
		this.completeAddress = "";
		this.totalSquareFeet = 0.0;
		this.occupancyGroup = "";
		this.subGroup = "";
	}
	
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subGroup) {
		super();
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
	}

	public void draw() {
		System.out.println("Drawing code for " + this.getClass() + ".");
	}
	
	public String displayData() {
		return String.format("Project Name: %s \n"
				+ "Complete Address: %s\n"
				+ "Total Square Feet: %s\n"
				+ "Occupancy Group: %s\n"
				+ "Sub Group: %s\n", projectName, completeAddress, totalSquareFeet,
				occupancyGroup, subGroup);
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCompleteAddress() {
		return completeAddress;
	}

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	public String getOccupancyGroup() {
		return occupancyGroup;
	}

	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}

	public String getSubGroup() {
		return subGroup;
	}

	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	}
	
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
