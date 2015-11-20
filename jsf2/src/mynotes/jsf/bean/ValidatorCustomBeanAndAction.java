package mynotes.jsf.bean;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean(name = "validatorCustomBeanAndAction")
public class ValidatorCustomBeanAndAction {

	private String primaryEmail;
	private String seconfryEmail;

	public String submit() {
		System.out.println("In Submit");
		System.out.println("primaryEmail=>" + primaryEmail);
		System.out.println("seconfryEmail=>" + seconfryEmail);
		return "validatorCustom";
	}

	public void validateEmailFromBean(FacesContext arg0, UIComponent arg1, Object val)
			throws ValidatorException {
		String EMAIL_REGEXP = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		String email = (String) val;
		Pattern mask = null;
		mask = Pattern.compile(EMAIL_REGEXP);
		Matcher matcher = mask.matcher(email);

		if (!matcher.matches()) {
			FacesMessage message = new FacesMessage();
			message.setDetail("Please enter a valid email [from validator bean]");
			message.setSummary("Email not valid [from Validator bean]");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(message);
		}

	}

	public String getPrimaryEmail() {
		return primaryEmail;
	}

	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

	public String getSeconfryEmail() {
		return seconfryEmail;
	}

	public void setSeconfryEmail(String seconfryEmail) {
		this.seconfryEmail = seconfryEmail;
	}

}
