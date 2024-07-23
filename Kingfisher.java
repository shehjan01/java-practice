package bhaichara;

public class Kingfisher {
	private int hours;
	 private double costperhour;
	public Kingfisher(int hours, double costperhour) {
		this.hours = hours;
		this.costperhour = costperhour;
	}
	public Kingfisher() {
		this.hours = 3;
		this.costperhour = 110;
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
