package bhaichara;

public class Airindia implements Airfare {
	 private int hours;
	 private double costperhour;
	public Airindia(int hours, double costperhour) {
		this.hours = hours;
		this.costperhour = costperhour;
	}
	public Airindia() {
		this.hours = 12;
		this.costperhour = 120;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public double getCostperhour() {
		return costperhour;
	}
	public void setCostperhour(double costperhour) {
		this.costperhour = costperhour;
	}
	@Override
	public String toString() {
		return "Airindia [hours=" + hours + ", costperhour=" + costperhour + "]";
	}
	public double claculate_Amount() {
		return hours*costperhour*8;
		
	}
	
}
