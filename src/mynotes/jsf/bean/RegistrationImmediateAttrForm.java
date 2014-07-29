package mynotes.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="registrationImmediateAttrForm")
@SessionScoped
public class RegistrationImmediateAttrForm {

	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	
}
