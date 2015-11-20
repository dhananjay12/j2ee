package mynotes.springmvc.form;

public class RegistrationForm {
	
	private String fname;
	private String lname;
	private String email;
	
	@Override
	public String toString() {
		return "fname="+this.fname+"\t"+
				"lname="+this.lname+"\t"+
				"email="+this.email;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
