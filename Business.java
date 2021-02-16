
public class Business extends Building{
	protected int numRentableUnits;
	
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	public Business() {
		super();
		this.numRentableUnits = 0;
	}

	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subGroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		// TODO Auto-generated constructor stub
	}
	
	public void draw() {
		System.out.println("Drawing code for " + this.getClass() + ".");
	}
	
	public String displayData() {
		return String.format("%s"
				+ "Rentable Units: %s \n", super.displayData(), this.numRentableUnits);
	}

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
