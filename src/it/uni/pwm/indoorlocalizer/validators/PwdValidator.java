package it.uni.pwm.indoorlocalizer.validators;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class PwdValidator extends FieldValidatorSupport {

	static Pattern maiuscole = Pattern.compile("[A-Z]");
	static Pattern minuscole = Pattern.compile("[a-z]");
	static Pattern numeri = Pattern.compile("[0-9]");
	
	@Override
	public void validate(Object object) throws ValidationException {
	
		String inputPassword = (String) this.getFieldValue(this.getFieldName(), object);
		
		System.out.println("-- "+inputPassword);
		Boolean passContieneMinuscole = minuscole.matcher(inputPassword).find();
		Boolean passContieneMaiuscole = maiuscole.matcher(inputPassword).find();
		Boolean passContieneNumeri = numeri.matcher(inputPassword).find();
		
		if(!passContieneMinuscole||!passContieneMaiuscole||!passContieneNumeri || inputPassword.length() < 6){
			addFieldError(getFieldName(), object);
		}
		
	}

}
