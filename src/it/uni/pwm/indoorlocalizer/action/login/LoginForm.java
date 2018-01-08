package it.uni.pwm.indoorlocalizer.action.login;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

import it.uni.pwm.indoorlocalizer.interceptors.UtenteAware;
import it.uni.pwm.indoorlocalizer.model.pojo.Utente;
import it.uni.pwm.indoorlocalizer.util.Costanti;

public class LoginForm extends ActionSupport implements SessionAware,UtenteAware{

	private static Logger log= LogManager.getLogger();
	private static final long serialVersionUID = 1L;
	private Map<String, Object> session;
	private Utente utente;
	
	public String execute() 
	{
		
		System.out.println("controllo sessione");
		
		if(session.get(Costanti.SESSIONE_UTENTE) !=null && session.get(Costanti.SESSIONE_UTENTE).equals(utente)) {
			System.out.println("sei già loggato");
			return SUCCESS; // utente loggato
		}
		System.out.println("ritorno success quindi devi loggare");
		return LOGIN;
		
	}

	@Override
	public void setUtente(Utente utente) {
		System.out.println("utente iniettato");
		this.utente=utente;
		
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}

}
