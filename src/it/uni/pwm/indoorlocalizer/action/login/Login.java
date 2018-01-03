package it.uni.pwm.indoorlocalizer.action.login;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

import it.uni.pwm.indoorlocalizer.model.dao.UtenteDaoFactory;
import it.uni.pwm.indoorlocalizer.model.pojo.Utente;
import it.uni.pwm.indoorlocalizer.util.Costanti;

public class Login extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	private Map<String, Object> session;

	private String email;
	private String pwd;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String execute() {
		System.out.println("execute");

		if (getEmail().isEmpty() || getPwd().isEmpty()) {
			System.out.println("controlla i campi");
			addActionError("errore campi");
			return INPUT;
		} else {
			Utente utente = UtenteDaoFactory.getDAO().login(getEmail(), getPwd());
			if (utente == null) {
				addActionError("utente non esiste");
				return INPUT;
			}

			session.put(Costanti.SESSIONE_UTENTE, utente);
			System.out.println("sessione inserita");
			return SUCCESS;
		}

	}
	
	

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
