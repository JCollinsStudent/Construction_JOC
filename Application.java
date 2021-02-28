/**
 * This Construction application is a mapping application for architecture projects.
 * This application supports the Business and Residential occupancy groups.
 * This specific class is used to test the functionality of the Construction application.
 * 
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-02-27
 */
public class Application {

	/**
	 * This is the main method which tests all of the objects within each class.
	 * 
	 * @param args unused
	 * @return nothing
	 */
	public static void main(String[] args) {
		
		//Building class tests
		System.out.println("Building Tests: \n");
		Building emptyBuilding = new Building();
		emptyBuilding.draw();
		System.out.println("Empty Constructor Test: \n" + emptyBuilding.displayData());
		
		Building myBuilding = new Building("MyProjectName", "MyAddress", 5, "OccGroup", "Subgroup");
		System.out.println("Constructor set vars: \n" + myBuilding.displayData());
		
		myBuilding.setCompleteAddress("This is my address");
		myBuilding.setOccupancyGroup("This is my occupancy group");
		myBuilding.setProjectName("This is my project name");
		myBuilding.setSubGroup("This is my sub group");
		myBuilding.setTotalSquareFeet(25);
		
		System.out.println("Mutator method set vars: \n" + myBuilding.displayData());
		
		System.out.println("Accessor method test: " + myBuilding.getCompleteAddress() + " " + myBuilding.getOccupancyGroup() + " " + myBuilding.getProjectName() + " " + myBuilding.getSubGroup() + " " + myBuilding.getTotalSquareFeet());
		
		System.out.println("\ntoString() test: \n" + myBuilding);
		
		for (int i=0; i<100; i++) {
			System.out.print("-");
		}
		System.out.println("");
		
		
		//Business class tests
		System.out.println("Business Tests: \n");
		Business emptyBusiness = new Business();
		emptyBusiness.draw();
		System.out.println("Empty Constructor Test: \n" + emptyBusiness.displayData());
		
		Business myBusiness = new Business("MyProjectName", "MyAddress", 5, "Business", "N/A");
		System.out.println("Constructor set vars: \n" + myBusiness.displayData());
		
		myBusiness.setNumRentableUnits(7);
		
		System.out.println("Mutator method set vars: \n" + myBusiness.displayData());
		
		System.out.println("Accessor method test: " + myBusiness.getNumRentableUnits());
		
		System.out.println("\ntoString() test: \n" + myBusiness);
		
		for (int i=0; i<100; i++) {
			System.out.print("-");
		}
		System.out.println("");
		
		//Mall class tests
		System.out.println("Mall Tests: \n");
		Mall emptyMall = new Mall();
		emptyMall.draw();
		System.out.println("Empty Constructor Test: \n" + emptyBusiness.displayData());
		
		Mall myMall = new Mall("MyProjectName", "MyAddress", 5, "Business", "Mall");
		System.out.println("Constructor set vars: \n" + myMall.displayData());
		
		myMall.setNumRentedUnits(7);
		myMall.setMedianUnitSize(8);
		myMall.setNumParkingSpaces(9);
		
		System.out.println("Mutator method set vars: \n" + myMall.displayData());
		
		System.out.println("Accessor method test: " + myMall.getNumRentedUnits() + " " + myMall.getMedianUnitSize() + " " + myMall.getNumParkingSpaces());
		
		System.out.println("\ntoString() test: \n" + myMall);
		
		for (int i=0; i<100; i++) {
			System.out.print("-");
		}
		System.out.println("");
		
		
		//Residential class tests
		System.out.println("Residential Tests: \n");
		Residential emptyResidential = new Residential();
		emptyResidential.draw();
		System.out.println("Empty Constructor Test: \n" + emptyResidential.displayData());
		
		Residential myResidential = new Residential("MyProjectName", "MyAddress", 5, "Residential", "N/A");
		myResidential.draw();
		System.out.println("Constructor set vars: \n" + myResidential.displayData());
		
		myResidential.setNumBedrooms(7);
		myResidential.setNumBathrooms(8);
		myResidential.setLaundryRoom(true);
		
		System.out.println("Mutator method set vars: \n" + myResidential.displayData());
		
		System.out.println("Accessor method test: " + myResidential.getNumBedrooms() + " " + myResidential.getNumBathrooms() + " " + myResidential.isLaundryRoom());
		
		System.out.println("\ntoString() test: \n" + myResidential);
		
		for (int i=0; i<100; i++) {
			System.out.print("-");
		}
		System.out.println("");
		
		
		//Apartment class tests
		System.out.println("Apartment Tests: \n");
		Apartment emptyApt = new Apartment();
		emptyApt.draw();
		System.out.println("Empty constructor test: \n" + emptyApt.displayData());
		
		Apartment myApt = new Apartment("MyProjectName", "MyAddress", 5, "Residential", "Apartment");
		System.out.println("Constructor set vars: \n" + myApt.displayData());
		
		myApt.setNumRentableUnits(7);
		myApt.setAvgUnitSize(8);
		myApt.setParkingAvailable(true);
		
		System.out.println("Mutator method set vars: \n" + myApt.displayData());
		
		System.out.println("Accessor method test: " + myApt.getNumRentableUnits() + " " + myApt.getAvgUnitSize() + " " + myApt.isParkingAvailable());
		
		System.out.println("\ntoString() test: \n" + myApt);
		
		for (int i=0; i<100; i++) {
			System.out.print("-");
		}
		System.out.println("");
		
		
		//SingleFamilyHome class tests
		System.out.println("SingleFamilyHome Tests: \n");
		SingleFamilyHome emptyHome = new SingleFamilyHome();
		emptyHome.draw();
		System.out.println("Empty constructor test: \n" + emptyHome.displayData());
		
		SingleFamilyHome myHome = new SingleFamilyHome("MyProjectName", "MyAddress", 5, "Residential", "Home");
		System.out.println("Constructor set vars: \n" + myHome.displayData());
		
		myHome.setGarage(true);
		
		System.out.println("Mutator method set vars: \n" + myHome.displayData());
		
		System.out.println("Accessor method test: " + myHome.isGarage());
		
		System.out.println("\ntoString() test: \n" + myHome);
		
	}

}
