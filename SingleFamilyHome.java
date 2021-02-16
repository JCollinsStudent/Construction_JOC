
public class SingleFamilyHome extends Residential{
	private boolean garage;
	
	public SingleFamilyHome() {
		super();
		this.garage = false;
	}

	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subGroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		// TODO Auto-generated constructor stub
	}
	
	public void draw() {
		System.out.println("Drawing code for " + this.getClass() + ".");
	}
	
	public String displayData() {
		return String.format("%s"
				+ "Garage: %s \n", super.displayData(), this.garage);
	}

	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}

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
