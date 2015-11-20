package mynotes.jsf.actionBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import mynotes.jsf.bean.RegistrationImmediateAttrForm;
@ManagedBean(name="registrationImmediateAttrAction")
public class RegistrationImmediateAttrAction {

	@ManagedProperty(value="#{registrationImmediateAttrForm}")
	RegistrationImmediateAttrForm aRegistrationImmediateAttrForm;

	
	public String initializeRegistration(){
		System.out.println("Inside initializeRegistration");
		return "registration";
	}

	public String register(){
		System.out.println("Inside register");
		System.out.println("Name=>"+aRegistrationImmediateAttrForm.getName());

		return "registration";
	}
	
	public String cancel(){
		System.out.println("Inside cancel");
		return "preRegistration";
	}
	
	public RegistrationImmediateAttrForm getaRegistrationImmediateAttrForm() {
		return aRegistrationImmediateAttrForm;
	}

	public void setaRegistrationImmediateAttrForm(
			RegistrationImmediateAttrForm aRegistrationImmediateAttrForm) {
		this.aRegistrationImmediateAttrForm = aRegistrationImmediateAttrForm;
	}
}
