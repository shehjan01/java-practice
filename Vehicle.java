package superExample;

public class Vehicle {
	 String Comname;

	public Vehicle() {
		this.Comname = "Toyota";
	}

	public String getComname() {
		return Comname;
	}

	public void setComname(String comname) {
		Comname = comname;
	}

	@Override
	public String toString() {
		return "Vehicle [Comname=" + Comname + "]";
	}
	
}
