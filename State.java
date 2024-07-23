
public class State extends Country {
	private String State_Name;

	public String getState_Name() {
		return State_Name;
	}

	public void setState_Name(String state_Name) {
		State_Name = state_Name;
	}

	@Override
	public String toString() {
		return "State [State_Name=" + getState_Name() + ", Cname=" + getCname() + "]";
	}
	
}
