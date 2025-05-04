package BusRes;
import java.util.*;


public class BusMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();
		
		buses.add(new Bus(1,3,true,"Intrcity"));
		buses.add(new Bus(2,3,true,"Zingbus"));
		buses.add(new Bus(3,3,true,"Volvo"));
	

		Scanner scanner = new Scanner(System.in);
		
		for(Bus b : buses) {
			b.displayInfo();
		}
		
		int userOpt=1;
		while(userOpt ==1) {
		System.out.println("Enter 1 to book and 2 to exit");
		userOpt = scanner.nextInt();
		if(userOpt ==1) {
			Booking booking = new Booking();
			
			if(booking.isAvailable(bookings,buses)) {
				bookings.add(booking);
				System.out.println("Booking confirmed");
			}
			else
				System.out.println("Try another date");
		}
		
	}
		
	
	
	
	}

	
}
