package it.uni.pwm.indoorlocalizer.action.json;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import it.uni.pwm.indoorlocalizer.model.dao.UtenteDao;
import it.uni.pwm.indoorlocalizer.model.dao.UtenteDaoFactory;
import it.uni.pwm.indoorlocalizer.model.dao.UtenteHome;
import it.uni.pwm.indoorlocalizer.model.pojo.Utente;

public class RicercaUtente extends ActionSupport {

	private static Logger log= LogManager.getLogger();
	private static final long serialVersionUID = 1L;
	private int id; // iniettato
	private List<Utente> result; // return

	public String execute() {
		result = new ArrayList<Utente>();
		if (id == 0) 
			result = UtenteDaoFactory.getDAO().retrive();
		else
			result.add(UtenteDaoFactory.getDAO().retriveFromId(id));

		return "SUCCESS";
	} 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Utente> getResult() {
		return result;
	}

	public void setResult(List<Utente> result) {
		this.result = result;
	}

}
