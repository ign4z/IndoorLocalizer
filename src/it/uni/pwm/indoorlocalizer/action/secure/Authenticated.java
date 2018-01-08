package it.uni.pwm.indoorlocalizer.action.secure;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import it.uni.pwm.indoorlocalizer.interceptors.UtenteAware;
import it.uni.pwm.indoorlocalizer.model.pojo.Utente;
import it.uni.pwm.indoorlocalizer.util.Costanti;

public class Authenticated extends ActionSupport implements UtenteAware, Action, SessionAware {

	private static Logger log = LogManager.getLogger();
	private static final long serialVersionUID = 1L;
	private Utente utente;
	private Map<String, Object> session;

	public String execute() {
		return SUCCESS;
	}

	public Utente getUtente() {
		return utente;
	}

	@Override
	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public String logOut() {
		log.debug("uscito");
		session.remove(Costanti.SESSIONE_UTENTE);
		return LOGIN;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

}
