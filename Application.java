
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Building Tests: \n");
		Building emptyBuilding = new Building();
		emptyBuilding.draw();
		System.out.println("Empty Constructor Test: \n" + emptyBuilding.displayData());
		
		Building myBuilding = new Building("MyProjectName", "MyAddress", 5, "OccGroup", "Subgroup");
		myBuilding.draw();
		System.out.println("Constructor set vars: \n" + myBuilding.displayData());
		
		myBuilding.setCompleteAddress("This is my address");
		myBuilding.setOccupancyGroup("This is my occupancy group");
		myBuilding.setProjectName("This is my project name");
		myBuilding.setSubGroup("This is my sub group");
		myBuilding.setTotalSquareFeet(25);
		
		System.out.println("Mutator method set vars: \n" + myBuilding.displayData());
		
		System.out.println("Accessor method test: " + myBuilding.getCompleteAddress() + myBuilding.getOccupancyGroup() + myBuilding.getProjectName() + myBuilding.getSubGroup() + myBuilding.getTotalSquareFeet());
		
		for (int i=0; i<100; i++) {
			System.out.print("-");
		}
		System.out.println("");
		
		System.out.println("Business Tests: \n");
		Business emptyBusiness = new Business();
		emptyBuilding.draw();
		System.out.println("Empty Constructor Test: \n" + emptyBusiness.displayData());
		
		Business myBusiness = new Business("MyProjectName", "MyAddress", 5, "OccGroup", "Subgroup");
		System.out.println("Constructor set vars: \n" + myBusiness.displayData());
		myBusiness.setNumRentableUnits(7);
		
		System.out.println("Mutator method set vars: \n" + myBusiness.displayData());
		
		for (int i=0; i<100; i++) {
			System.out.print("-");
		}
		
		System.out.println("Mall Tests: \n");
	}

}
