
public class Residential extends Building{
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	public Residential() {
		super();
		this.numBedrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = false;
	}

	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subGroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		// TODO Auto-generated constructor stub
	}
	
	public String displayData() {
		return String.format("%s"
				+ "Bedrooms: %s \n"
				+ "Bathrooms: %s \n"
				+ "Laundry Room: %s \n", super.displayData(), this.numBedrooms, this.numBathrooms, this.laundryRoom);
	}

	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}

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
