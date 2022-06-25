
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int availableSeats = 35;
		availableSeats = availableSeats - 5;
		double groceryTotal = 45.32;
		groceryTotal +=  2.15;
		System.out.println(groceryTotal);
		String firstName = "John";
		char midInit = 'S';
		String lastName = "Stamos";
		System.out.println(midInit);
		boolean hotOutside = false;
		System.out.println(hotOutside);
		hotOutside = !hotOutside;
		System.out.println(hotOutside);
		String fullName = firstName + " " + midInit + " " + lastName;
		System.out.println(fullName);
		String address = "101 Wayword Rd";
		System.out.println("Please welcome " + fullName + ", who lives at " + address);
		
		
	}

}
