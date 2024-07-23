package superExample;

public class TwoWheeler extends Vehicle {
	private String Fuel;

	public TwoWheeler() {
		super();
		this.Fuel = "Petrol";
	}
	
	
	public TwoWheeler(String fuel,String com) {
		super();
		Fuel = fuel;
		this.Comname=com;
	}


	public String getFuel() {
		return Fuel;
	}

	public void setFuel(String fuel) {
		Fuel = fuel;
	}

	@Override
	public String toString() {
		
		return "TwoWheeler [Fuel=" + Fuel + "]"+super.toString();
	}
	
	
}
