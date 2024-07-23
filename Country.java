
public class Country {
	private String Cname;

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	@Override
	public String toString() {
		return "Country [Cname=" + Cname + "]";
	}
	
}
