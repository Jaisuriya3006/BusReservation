package BusRes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

public class Booking {
	String passengerName;
	int BusNo;
	Date date;
	
	Booking(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		passengerName = sc.nextLine();
		System.out.println("Enter bus no:");
		BusNo = sc.nextInt();
		System.out.println("date dd-mm-yyyy:");
		String dateInput = sc.next();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses){
		int capasity =0;
		
		for(Bus bus : buses) {
			
			if(bus.getBusNo()== BusNo) {
				capasity = bus.getCapasity();
			}
		}
			int booked = 0;
			for(Booking b : bookings) {
				if(b.BusNo == BusNo && b.date.equals(date)) {
					booked++;
				}
			}
			
		
		return booked<capasity? true : false;
	}

}
