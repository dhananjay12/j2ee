package mynotes.jsf.util;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

import mynotes.jsf.bean.RegistrationValueChangeListnerForm;

public class CountryValueChangeListner implements ValueChangeListener{

	public void processValueChange(ValueChangeEvent event)
			throws AbortProcessingException {
		System.out.println("CountryValueChangeListner processValueChange method");
		 
        String oldValue = (String) event.getOldValue(); // obtain previous selected value
        String newValue = (String) event.getNewValue(); // obtain current selected value
 
        System.out.println("oldValue=>" + oldValue);
        System.out.println("newValue=>" + newValue);
        RegistrationValueChangeListnerForm form = (RegistrationValueChangeListnerForm) FacesContext.getCurrentInstance().
                getExternalContext().getSessionMap().get("registrationValueChangeListnerForm"); 
        if ("us".equalsIgnoreCase(newValue)) {
        	form.getCities().clear();
        	form.getCities().put("New York", "nyk");
        	form.getCities().put("Washington D.C.", "dc");
        } if ("ind".equalsIgnoreCase(newValue)) {
        	form.getCities().clear();
        	form.getCities().put("Mumbai", "mum");
        	form.getCities().put("Pune", "pun");
        } 
        FacesContext.getCurrentInstance().renderResponse();
		
	}

}
