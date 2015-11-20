package mynotes.springmvc.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import mynotes.springmvc.form.RegistrationForm;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class RegistrationValidator implements Validator {

	public boolean supports(Class<?> clazz) {

		return clazz.isAssignableFrom(RegistrationForm.class);
	}

	public void validate(Object obj, Errors errors) {

		RegistrationForm registrationForm = (RegistrationForm) obj;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fname","error.reqired");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lname","error.reqired");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email","error.reqired");

		if (registrationForm.getEmail() != null) {
			String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
					+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
			Pattern pattern = Pattern.compile(EMAIL_PATTERN);
			Matcher matcher = pattern.matcher(registrationForm.getEmail());
			if (!matcher.matches()) {
				errors.rejectValue("email", "invalid.email");
			}
		}

	}

}
