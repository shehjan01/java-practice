package bhaichara;

public class Indigo implements Airfare {
	private int hours;
	 private double costperhour;
	public Indigo(int hours, double costperhour) {
		this.hours = hours;
		this.costperhour = costperhour;
	}
	public Indigo() {
		this.hours = 7;
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
		return "Indigo [hours=" + hours + ", costperhour=" + costperhour + "]";
	}
	public double claculate_Amount() {
		return hours*costperhour*8;
		
	}
	 
}
