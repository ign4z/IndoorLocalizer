package it.uni.pwm.indoorlocalizer.interceptors;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import it.uni.pwm.indoorlocalizer.model.pojo.Utente;
import it.uni.pwm.indoorlocalizer.util.Costanti;


public class AuthenticationInterceptor implements Interceptor {

	private static final long serialVersionUID = 1L;
	
	private static final Logger log = LogManager.getLogger("Interceptor");

	public void destroy() {
	}
	public void init() {
	}

	public String intercept( ActionInvocation actionInvocation ) throws Exception {
		Map<String, Object> session = actionInvocation.getInvocationContext().getSession();
		log.debug("interception chiamato");
		
		Utente utente = (Utente) session.get( Costanti.SESSIONE_UTENTE );
		
		if (utente == null) {
		    return Action.LOGIN;
		} 

		else {
		    Action action = ( Action ) actionInvocation.getAction();
		    
		    if (action instanceof UtenteAware) {
		        ((UtenteAware)action).setUtente(utente);
		        log.debug("utente inserito in sessione");
		    }
		    return actionInvocation.invoke();
		}
	}
}
