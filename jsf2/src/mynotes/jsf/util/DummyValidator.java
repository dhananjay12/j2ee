package mynotes.jsf.util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
@FacesValidator("dummyValidator")
public class DummyValidator implements Validator{

	public void validate(FacesContext context, UIComponent component, Object value)
			throws ValidatorException {
		System.out.println("DummyValidator validate: " +" component=>"+component.getId()+" value=>"+ value);
		
	}

}
