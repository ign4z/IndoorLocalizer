package it.uni.pwm.indoorlocalizer.action.login;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import it.uni.pwm.indoorlocalizer.model.pojo.Utente;
import it.uni.pwm.indoorlocalizer.util.Costanti;

public class Authenticated extends ActionSupport implements UtenteAware, Action,SessionAware {

	private static final long serialVersionUID = 1L;
	private Utente utente;
	private Map<String, Object> session;
	
	public String execute(){
		return SUCCESS;
	}

	public Utente getUtente() {
		return utente;
	}

	@Override
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	
	public String logOut() 
	{
		System.out.println("uscito");
		session.remove(Costanti.SESSIONE_UTENTE);
        return INPUT;
	}
	

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
		
	}
	
}
