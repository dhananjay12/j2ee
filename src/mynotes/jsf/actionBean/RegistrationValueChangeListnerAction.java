package mynotes.jsf.actionBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import mynotes.jsf.bean.RegistrationValueChangeListnerForm;
@ManagedBean(name="registrationValueChangeListnerAction")
public class RegistrationValueChangeListnerAction {
	
	@ManagedProperty(value="#{registrationValueChangeListnerForm}")
	RegistrationValueChangeListnerForm aRegistrationValueChangeListnerForm;

	public RegistrationValueChangeListnerForm getaRegistrationValueChangeListnerForm() {
		return aRegistrationValueChangeListnerForm;
	}

	public void setaRegistrationValueChangeListnerForm(
			RegistrationValueChangeListnerForm aRegistrationValueChangeListnerForm) {
		this.aRegistrationValueChangeListnerForm = aRegistrationValueChangeListnerForm;
	}
	
	public String submit(){
		System.out.println("Inside Submit");
		return "register";
	}

}
