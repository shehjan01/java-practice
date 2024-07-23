package test;

public class Artist extends Person {
	private String  Name,Speciality;
	

	public Artist(String city, String state, int pincode, String name, String speciality) {
		super(city, state, pincode);
		Name = name;
		Speciality = speciality;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSpeciality() {
		return Speciality;
	}

	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}

	@Override
	public String toString() {
		return "Artist [Name=" + getName() + ", Speciality=" + getSpeciality() + ", City=" + getCity()
				+ ",State=" + getState() + ",Pincode=" + getPincode() + "]";
	}

	
	
	
}