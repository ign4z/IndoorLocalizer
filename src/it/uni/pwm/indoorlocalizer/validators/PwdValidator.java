package it.uni.pwm.indoorlocalizer.validators;

import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class PwdValidator extends FieldValidatorSupport {

	private static Logger log= LogManager.getLogger();
	
	static Pattern maiuscole = Pattern.compile("[A-Z]");
	static Pattern minuscole = Pattern.compile("[a-z]");
	static Pattern numeri = Pattern.compile("[0-9]");
	
	@Override
	public void validate(Object object) throws ValidationException {
	
		String inputPassword = (String) this.getFieldValue(this.getFieldName(), object);
		
		log.debug("-- "+inputPassword);
		Boolean passContieneMinuscole = minuscole.matcher(inputPassword).find();
		Boolean passContieneMaiuscole = maiuscole.matcher(inputPassword).find();
		Boolean passContieneNumeri = numeri.matcher(inputPassword).find();
		
		if(!passContieneMinuscole||!passContieneMaiuscole||!passContieneNumeri || inputPassword.length() < 6){
			addFieldError(getFieldName(), object);
		}
		
	}

}
