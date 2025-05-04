package BusRes;

public class Bus {
	
	private int BusNo;
	private int capasity;
	private Boolean AC;
	private String BusName;
	
	
	Bus(int no, int capasity, Boolean ac, String bname){
		this.BusNo = no;
		this.capasity = capasity;
		this.AC = ac;
		this.BusName = bname;
	}


	public int getBusNo() {
		return BusNo;
	}


	public void setBusNo(int busNo) {
		BusNo = busNo;
	}


	public int getCapasity() {
		return capasity;
	}


	public void setCapasity(int capasity) {
		this.capasity = capasity;
	}


	public Boolean getAC() {
		return AC;
	}


	public void setAC(Boolean ac) {
		AC = ac;
	}


	public String getBusName() {
		return BusName;
	}


	public void setBusName(String busName) {
		BusName = busName;
	}
	

	public void displayInfo(){
		System.out.println("BusNo  "+ BusNo +"  "+"  capasity  " + capasity + "  AC  " + AC + "  Name  " + BusName);
	}
}
