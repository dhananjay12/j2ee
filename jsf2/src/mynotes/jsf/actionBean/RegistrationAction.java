package mynotes.jsf.actionBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import mynotes.jsf.bean.RegistrationForm;

@ManagedBean
public class RegistrationAction {
	
	@ManagedProperty(value="#{registrationForm}")
	RegistrationForm myRegistrationForm;
	
	public String register(){
		System.out.println("Inside register");		
		System.out.println("Name=>"+myRegistrationForm.getName());
		System.out.println("Email=>"+myRegistrationForm.getEmail());
		return "registrationSuccess";
	}

	public RegistrationForm getMyRegistrationForm() {
		return myRegistrationForm;
	}

	public void setMyRegistrationForm(RegistrationForm myRegistrationForm) {
		this.myRegistrationForm = myRegistrationForm;
	}

}
